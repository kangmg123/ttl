package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpIdRestController {
	@GetMapping("/api/v1/user/{employeeId}")
	     public String getUserId(@PathVariable String employeeId) {
	         return employeeId;
	     }

}
