package com.igmi.jedoku.integration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integration")
public class IntegrationController {
	@GetMapping("/test")
	public String getIntegration() {
		return "The CI/CD Integration is completed";
	}

}
