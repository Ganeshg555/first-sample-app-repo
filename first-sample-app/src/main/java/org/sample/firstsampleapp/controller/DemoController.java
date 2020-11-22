package org.sample.firstsampleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	//Demo controller first api
	@GetMapping
	public ResponseEntity<Object> demo() {
		return ResponseEntity.ok("This is demo api");
	}
	
	
	
}
