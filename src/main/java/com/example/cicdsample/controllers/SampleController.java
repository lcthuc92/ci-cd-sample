package com.example.cicdsample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SampleController {
	public static final List<String> WC = Arrays.asList("Welcome", "to", "CI/CD", "0.0.6-SNAPSHOT");
	public static final String ID_IS_OUT_OF_BOUND = "id is out of bound!";

	@GetMapping("/")
	public List<String> get() {
		return WC;
	}

	@GetMapping("/hello")
	public String hello(@RequestParam int id) {
		if(id >= WC.size() || id < 0) {
			return ID_IS_OUT_OF_BOUND;
		}
		return WC.get(id);
	}
}
