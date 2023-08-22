package com.example.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
@GetMapping("/get")
public String getName() {
	String studentName="IamNeo";
	return "Welcome"+studentName+"!";
}
}
