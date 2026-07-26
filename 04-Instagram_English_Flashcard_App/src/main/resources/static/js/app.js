(function () {
	"use strict";

	const state = {
		allCards: [],
		deck: [],
		index: 0,
		category: "All",
	};

	const el = {
		chips: document.getElementById("category-chips"),
		card: document.getElementById("flash-card"),
		frontCategory: document.getElementById("front-category"),
		frontText: document.getElementById("front-text"),
		frontHint: document.getElementById("front-hint"),
		backCategory: document.getElementById("back-category"),
		backText: document.getElementById("back-text"),
		backExample: document.getElementById("back-example"),
		prevBtn: document.getElementById("prev-btn"),
		nextBtn: document.getElementById("next-btn"),
		shuffleBtn: document.getElementById("shuffle-btn"),
		resetBtn: document.getElementById("reset-btn"),
		progressLabel: document.getElementById("progress-label"),
		progressFill: document.getElementById("progress-fill"),
	};

	function fetchCards() {
		return fetch("/api/flashcards").then((res) => res.json());
	}

	function buildDeck() {
		state.deck =
			state.category === "All"
				? state.allCards.slice()
				: state.allCards.filter((c) => c.category === state.category);
		state.index = 0;
		render();
	}

	function renderChips() {
		const categories = ["All", ...new Set(state.allCards.map((c) => c.category))];
		el.chips.innerHTML = "";
		categories.forEach((cat) => {
			const chip = document.createElement("button");
			chip.className = "chip" + (cat === state.category ? " active" : "");
			chip.textContent = cat;
			chip.addEventListener("click", () => {
				state.category = cat;
				renderChips();
				buildDeck();
			});
			el.chips.appendChild(chip);
		});
	}

	function render() {
		el.card.classList.remove("flipped");

		if (state.deck.length === 0) {
			el.frontCategory.textContent = "";
			el.frontText.textContent = "No cards in this category yet.";
			el.frontHint.textContent = "";
			el.backText.textContent = "";
			el.backExample.textContent = "";
			el.progressLabel.textContent = "Card 0 / 0";
			el.progressFill.style.width = "0%";
			return;
		}

		const card = state.deck[state.index];
		el.frontCategory.textContent = card.category;
		el.frontText.textContent = card.front;
		el.frontHint.textContent = card.hint;

		el.backCategory.textContent = card.category;
		el.backText.textContent = card.back;
		el.backExample.textContent = "e.g. " + card.example;

		el.progressLabel.textContent = "Card " + (state.index + 1) + " / " + state.deck.length;
		el.progressFill.style.width = ((state.index + 1) / state.deck.length) * 100 + "%";
	}

	function flip() {
		if (state.deck.length === 0) return;
		el.card.classList.toggle("flipped");
	}

	function next() {
		if (state.deck.length === 0) return;
		state.index = (state.index + 1) % state.deck.length;
		render();
	}

	function prev() {
		if (state.deck.length === 0) return;
		state.index = (state.index - 1 + state.deck.length) % state.deck.length;
		render();
	}

	function shuffle() {
		for (let i = state.deck.length - 1; i > 0; i--) {
			const j = Math.floor(Math.random() * (i + 1));
			[state.deck[i], state.deck[j]] = [state.deck[j], state.deck[i]];
		}
		state.index = 0;
		render();
	}

	el.card.addEventListener("click", flip);
	el.nextBtn.addEventListener("click", next);
	el.prevBtn.addEventListener("click", prev);
	el.shuffleBtn.addEventListener("click", shuffle);
	el.resetBtn.addEventListener("click", () => {
		state.category = "All";
		renderChips();
		buildDeck();
	});

	document.addEventListener("keydown", (e) => {
		if (e.key === "ArrowRight") next();
		else if (e.key === "ArrowLeft") prev();
		else if (e.key === " ") {
			e.preventDefault();
			flip();
		}
	});

	fetchCards().then((cards) => {
		state.allCards = cards;
		renderChips();
		buildDeck();
	});
})();
