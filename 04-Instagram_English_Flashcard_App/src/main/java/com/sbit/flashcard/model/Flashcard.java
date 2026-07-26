package com.sbit.flashcard.model;

public class Flashcard {

	private int id;
	private String category;
	private String front;
	private String hint;
	private String back;
	private String example;

	public Flashcard() {
	}

	public Flashcard(int id, String category, String front, String hint, String back, String example) {
		this.id = id;
		this.category = category;
		this.front = front;
		this.hint = hint;
		this.back = back;
		this.example = example;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFront() {
		return front;
	}

	public void setFront(String front) {
		this.front = front;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}
}
