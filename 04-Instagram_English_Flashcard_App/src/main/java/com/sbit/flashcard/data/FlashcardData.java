package com.sbit.flashcard.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sbit.flashcard.model.Flashcard;

/**
 * Starter deck styled after the "Hindi to English" spoken-coaching format
 * (modal patterns, tense drills, connector phrases) commonly used by
 * spoken-English Instagram coaches. Content here is written fresh for this
 * app, not copied from any single account's images/captions.
 */
public final class FlashcardData {

	private static final List<Flashcard> CARDS = build();

	private FlashcardData() {
	}

	public static List<Flashcard> all() {
		return Collections.unmodifiableList(CARDS);
	}

	private static List<Flashcard> build() {
		List<Flashcard> list = new ArrayList<>();
		int id = 1;

		// ---------------- GRAMMAR (patterns / modals / connectors) ----------------
		id = add(list, id, "Grammar", "Should have + V3", "करना चाहिए था, लेकिन नहीं किया",
				"Used for regret about the past — something was the right thing to do, but it wasn't done.",
				"I should have studied harder for the exam.");
		id = add(list, id, "Grammar", "Could have + V3", "कर सकता था, लेकिन नहीं किया",
				"Expresses a past ability or option that was not used.",
				"I could have called you, but I forgot my phone.");
		id = add(list, id, "Grammar", "Would have + V3", "करता, अगर हालात अलग होते",
				"Used in the 3rd conditional to imagine a different past.",
				"I would have come to the party if you had invited me.");
		id = add(list, id, "Grammar", "There is no need to + V1", "कोई ज़रूरत नहीं है ... करने की",
				"Says an action is unnecessary.",
				"There is no need to worry about the results.");
		id = add(list, id, "Grammar", "Eventually, + Subject + Verb", "आख़िरकार",
				"Shows something happened after a long time or effort.",
				"Eventually, he passed the exam after three attempts.");
		id = add(list, id, "Grammar", "Can't live without + Noun/Gerund", "... के बिना नहीं रह सकता",
				"Expresses something you depend on heavily.",
				"I can't live without my morning cup of tea.");
		id = add(list, id, "Grammar", "As soon as + Subject + Verb", "जैसे ही",
				"Shows one action happens immediately after another.",
				"As soon as I reached home, it started raining.");
		id = add(list, id, "Grammar", "In spite of + Noun/Gerund", "के बावजूद",
				"Shows a contrast — something happened despite an obstacle.",
				"In spite of the heavy rain, we went out for a walk.");
		id = add(list, id, "Grammar", "Used to + V1", "पहले किया करता था (अब नहीं करता)",
				"Describes a past habit that has stopped.",
				"I used to play cricket every evening as a kid.");
		id = add(list, id, "Grammar", "Supposed to + V1", "करना चाहिए / ऐसा होना अपेक्षित है",
				"Talks about an expectation, obligation, or plan.",
				"You are supposed to submit the report by today.");

		// ---------------- TENSES ----------------
		id = add(list, id, "Tenses", "Present Simple", "आदत / सच्चाई / रोज़ का काम",
				"Subject + V1(+s/es) — for habits, facts, and routines.",
				"She goes to the gym every morning.");
		id = add(list, id, "Tenses", "Present Continuous", "अभी हो रहा है",
				"Subject + am/is/are + V-ing — for an action happening right now.",
				"I am writing an email right now.");
		id = add(list, id, "Tenses", "Present Perfect", "अभी-अभी पूरा हुआ / जीवन का अनुभव",
				"Subject + have/has + V3 — links the past to the present.",
				"I have finished my homework.");
		id = add(list, id, "Tenses", "Present Perfect Continuous", "कब से हो रहा है (अभी भी जारी है)",
				"Subject + have/has + been + V-ing — for an action that started in the past and continues.",
				"I have been working at this company since 2020.");
		id = add(list, id, "Tenses", "Past Simple", "बीता हुआ, पूरा हो चुका काम",
				"Subject + V2 — a completed action at a specific past time.",
				"He watched a movie last night.");
		id = add(list, id, "Tenses", "Past Continuous", "past में कोई काम चल रहा था",
				"Subject + was/were + V-ing — an action in progress in the past.",
				"I was cooking dinner when the phone rang.");
		id = add(list, id, "Tenses", "Past Perfect", "past से पहले वाला past",
				"Subject + had + V3 — an action completed before another past action.",
				"She had left the office before I arrived.");
		id = add(list, id, "Tenses", "Future Simple", "आगे होने वाला काम",
				"Subject + will + V1 — a decision made at the moment of speaking or a prediction.",
				"I will call you tomorrow morning.");
		id = add(list, id, "Tenses", "Future Continuous", "future में कोई काम चल रहा होगा",
				"Subject + will be + V-ing — an action in progress at a future point.",
				"This time tomorrow, I will be flying to Delhi.");
		id = add(list, id, "Tenses", "Future Perfect", "future में एक तय समय तक काम पूरा हो चुका होगा",
				"Subject + will have + V3 — an action completed before a future point.",
				"By next year, I will have completed my degree.");

		// ---------------- VOCABULARY ----------------
		id = add(list, id, "Vocabulary", "Reluctant", "अनिच्छुक", "Not willing to do something.",
				"He was reluctant to accept the new offer.");
		id = add(list, id, "Vocabulary", "Ambiguous", "अस्पष्ट / दोहरे अर्थ वाला", "Open to more than one interpretation; unclear.",
				"His answer to the question was ambiguous.");
		id = add(list, id, "Vocabulary", "Overwhelmed", "अभिभूत / बहुत ज़्यादा दबाव महसूस करना", "Having too much to deal with.",
				"I feel overwhelmed with all this work.");
		id = add(list, id, "Vocabulary", "Procrastinate", "टालमटोल करना", "To delay doing something that should be done.",
				"Stop procrastinating and start studying.");
		id = add(list, id, "Vocabulary", "Genuine", "असली / सच्चा", "Real, sincere, not fake.",
				"She gave a genuine smile when she saw us.");
		id = add(list, id, "Vocabulary", "Consistent", "निरंतर / लगातार एक जैसा", "Acting or done in the same way over time.",
				"Consistency is the key to learning a new language.");
		id = add(list, id, "Vocabulary", "Grateful", "आभारी / एहसानमंद", "Feeling thankful.",
				"I am really grateful for your help.");
		id = add(list, id, "Vocabulary", "Convenient", "सुविधाजनक", "Suitable for one's needs without much effort.",
				"Is 5 PM a convenient time for the call?");
		id = add(list, id, "Vocabulary", "Reckon", "अंदाज़ा लगाना / मानना", "To think or believe something.",
				"I reckon it will rain later today.");
		id = add(list, id, "Vocabulary", "Diligent", "मेहनती / लगनशील", "Showing care and effort in one's work.",
				"She is a diligent student who never misses class.");

		// ---------------- PHRASES ----------------
		id = add(list, id, "Phrases", "Kind of / Sort of", "थोड़ा सा / एक तरह से", "Used to soften a statement.",
				"I'm kind of tired today, let's meet tomorrow.");
		id = add(list, id, "Phrases", "Because + Subject + had + Noun", "क्योंकि ... था/थी",
				"A simple pattern for giving a past reason.",
				"I couldn't come because I had a mild fever.");
		id = add(list, id, "Phrases", "What's up with you?", "तुम्हारे साथ क्या हो रहा है?",
				"Used to ask why someone seems different or upset.",
				"You look worried — what's up with you?");
		id = add(list, id, "Phrases", "It's up to you", "यह तुम पर निर्भर है", "The decision is yours to make.",
				"We can go now or later, it's up to you.");
		id = add(list, id, "Phrases", "I can't help it", "मैं कुछ कर ही नहीं सकता / मजबूर हूँ",
				"Used when you can't control or stop something.",
				"I know I shouldn't laugh, but I can't help it.");
		id = add(list, id, "Phrases", "On the other hand", "दूसरी तरफ / दूसरी ओर",
				"Used to present a contrasting point.",
				"He is strict; on the other hand, he is very fair.");
		id = add(list, id, "Phrases", "To be honest", "सच कहूँ तो", "Used before sharing an honest opinion.",
				"To be honest, I didn't like the movie much.");
		id = add(list, id, "Phrases", "Piece of cake", "बहुत आसान काम", "Something very easy to do.",
				"Don't worry, this test will be a piece of cake for you.");
		id = add(list, id, "Phrases", "Break the ice", "बातचीत की अजीब शुरुआती चुप्पी तोड़ना",
				"To start a conversation in an awkward or new situation.",
				"He told a joke to break the ice at the meeting.");
		id = add(list, id, "Phrases", "Once in a blue moon", "कभी-कभार / बहुत कम", "Something that happens very rarely.",
				"We eat out once in a blue moon.");

		return list;
	}

	private static int add(List<Flashcard> list, int id, String category, String front, String hint, String back,
			String example) {
		list.add(new Flashcard(id, category, front, hint, back, example));
		return id + 1;
	}
}
