package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class APIController {
	public QuoteController(QuoteRepository repository) {
		this.repository = repository;
	}
	@GetMapping
	List<Address> searchProducts(@RequestParam String query,
								 @RequestParam(required = false, defaultValue = "0") int offset,
								 @RequestParam(required = false, defaultValue = "10") int limit) {
		return addressRepository.search(query, offset, limit);
	}
}