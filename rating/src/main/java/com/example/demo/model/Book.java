package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid", nullable = false)
	private Long bookId;

	@Column(name = "book_title")
	private String title;

	@Column(name = "book_rating")
	private Double rate; // This will store the average rating of the book.

	public Long getBookID() {
		return bookId;
	}

	public void setBookID(Long bookID) {
		this.bookId = bookID;
	}

	public String getBookTitle() {
		return title;
	}

	public void setBookTitle(String bookTitle) {
		this.title = bookTitle;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double bookRating) {
		this.rate = bookRating;
	}
}