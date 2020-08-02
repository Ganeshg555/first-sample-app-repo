package org.sample.firstsampleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping
	public ResponseEntity<?> hello() {
		return ResponseEntity.ok("Welcome to my First Spring Boot Application");
	}
	
}
