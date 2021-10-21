package com.example.cicdsample.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SampleControllerTest {
	private static final List<String> WC = Arrays.asList("Welcome", "to", "CI/CD");
	private SampleController controller;

	@BeforeEach
	void setup() {
		controller = new SampleController();
	}

	@Test
	void get() {
		List<String> strings = controller.get();
		assertEquals(WC, strings);
	}

	@Test
	void hello() {
		String hello = controller.hello(-1);
		assertEquals(hello, SampleController.ID_IS_OUT_OF_BOUND);

		hello = controller.hello(0);
		assertEquals(hello, WC.get(0));
	}
}
