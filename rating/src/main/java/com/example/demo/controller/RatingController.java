package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.RatingDTO;
import com.example.demo.DTO.RatingResponseDTO;
import com.example.demo.model.Rating;
import com.example.demo.service.RatingService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/rates")
public class RatingController {
	@Autowired
	private RatingService ratingService;

	@PostMapping("/create")
	public ResponseEntity<RatingResponseDTO> saveOrUpdateRating(@Valid @RequestBody RatingDTO ratingDTO) {
		RatingResponseDTO responseDTO = ratingService.saveOrUpdateRating(ratingDTO);
		return ResponseEntity.ok(responseDTO);
	}

	@GetMapping("/book/{bookId}")
	public double getBookRating(@PathVariable Long bookId) {
		return ratingService.getBookRating(bookId);
	}

	@GetMapping("/getrate/{userID}")
	public List<Rating> getRatingsByUserID(@PathVariable Long userID) {
		return ratingService.getRatingsByUserID(userID);
	}
}
