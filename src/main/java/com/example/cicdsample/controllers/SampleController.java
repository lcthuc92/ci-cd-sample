package com.example.cicdsample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SampleController {
	@GetMapping("/")
	public List<String> get() {
		return Arrays.asList("Welcome", "to", "CI/CD");
	}
}
