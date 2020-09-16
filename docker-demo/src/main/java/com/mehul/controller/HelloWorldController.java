package com.mehul.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mehul
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping("hello-world")
	public ResponseEntity<String> helloWorld(){
		ResponseEntity<String> response = new ResponseEntity<String>("Hello World!", HttpStatus.OK);
		return response;
	}
}
