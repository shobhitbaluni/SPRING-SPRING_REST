# 04 - Instagram English Flashcard App

A spoken-English flashcard app in the style of "Hindi &rarr; Fluent English"
Instagram coaching accounts (e.g. `englishwithyogesh`) — bite-sized cards for
**vocabulary**, **tenses**, **grammar patterns**, and **spoken phrases**, each
with a Hindi hint and an example sentence, just like the carousel posts these
accounts publish.

> Note: this deck's content was written fresh for this project (inspired by
> the general teaching format popular on such accounts), not scraped or
> copied from any account's actual images/captions.

## Stack

- Spring Boot 2.3 (`spring-boot-starter-web`) REST API serving the flashcard
  data from an in-memory list.
- Vanilla HTML/CSS/JS front end (`src/main/resources/static`) — a flip-card
  UI with category filters, shuffle, progress bar, and keyboard navigation
  (&larr;/&rarr; to move, Space to flip).

## API

| Method | Endpoint                              | Description                          |
|--------|----------------------------------------|---------------------------------------|
| GET    | `/api/flashcards`                     | All flashcards                        |
| GET    | `/api/flashcards/categories`          | Distinct category names               |
| GET    | `/api/flashcards/category/{category}` | Flashcards in one category            |
| GET    | `/api/flashcards/random?category=`    | One random card (optionally filtered) |

## Run it

```bash
cd 04-Instagram_English_Flashcard_App
./mvnw spring-boot:run
```

Then open `http://localhost:8383` in your browser.

## Content

40 starter cards across 4 categories (10 each):

- **Grammar** — modal/perfect patterns (`should have`, `could have`,
  `would have`), connectors (`as soon as`, `in spite of`), and common spoken
  structures (`there is no need to`, `used to`, `supposed to`).
- **Tenses** — all 10 English tenses with a one-line "when to use it" hint
  and an example.
- **Vocabulary** — everyday words with Hindi meanings (`reluctant`,
  `overwhelmed`, `procrastinate`, ...).
- **Phrases** — spoken-English chunks (`kind of / sort of`, `it's up to
  you`, `piece of cake`, ...).

To add more cards (e.g. from new posts), extend `build()` in
`src/main/java/com/sbit/flashcard/data/FlashcardData.java` — no other code
needs to change.
