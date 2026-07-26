package com.sbit.flashcard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sbit.flashcard.data.FlashcardData;
import com.sbit.flashcard.model.Flashcard;

@Service
public class FlashcardService {

	public List<Flashcard> getAll() {
		return FlashcardData.all();
	}

	public List<Flashcard> getByCategory(String category) {
		return FlashcardData.all().stream()
				.filter(card -> card.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());
	}

	public List<String> getCategories() {
		return FlashcardData.all().stream()
				.map(Flashcard::getCategory)
				.distinct()
				.collect(Collectors.toList());
	}

	public Flashcard getRandom(String category) {
		List<Flashcard> pool = (category == null || category.isEmpty())
				? new ArrayList<>(getAll())
				: getByCategory(category);
		if (pool.isEmpty()) {
			return null;
		}
		int index = (int) (Math.random() * pool.size());
		return pool.get(index);
	}
}
