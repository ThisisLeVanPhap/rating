package com.example.demo.DTO;

public class BookDTO {
	private Long bookID;
	private Double bookRating; // Điểm đánh giá trung bình của cuốn sách

	// Constructor
	public BookDTO(Long bookID, Double bookRating) {
		this.bookID = bookID;
		this.bookRating = bookRating;
	}

	// Getters and setters
	public Long getBookID() {
		return bookID;
	}

	public void setBookID(Long bookID) {
		this.bookID = bookID;
	}

	public Double getBookRating() {
		return bookRating;
	}

	public void setBookRating(Double bookRating) {
		this.bookRating = bookRating;
	}
}
