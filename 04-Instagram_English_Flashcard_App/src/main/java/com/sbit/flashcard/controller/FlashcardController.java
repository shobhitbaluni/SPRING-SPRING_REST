package com.sbit.flashcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbit.flashcard.model.Flashcard;
import com.sbit.flashcard.service.FlashcardService;

@RestController
@RequestMapping("/api/flashcards")
public class FlashcardController {

	@Autowired
	private FlashcardService flashcardService;

	@GetMapping
	public List<Flashcard> getAll() {
		return flashcardService.getAll();
	}

	@GetMapping("/categories")
	public List<String> getCategories() {
		return flashcardService.getCategories();
	}

	@GetMapping("/category/{category}")
	public List<Flashcard> getByCategory(@PathVariable String category) {
		return flashcardService.getByCategory(category);
	}

	@GetMapping("/random")
	public Flashcard getRandom(@RequestParam(required = false) String category) {
		return flashcardService.getRandom(category);
	}
}
