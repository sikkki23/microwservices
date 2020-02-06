package com.chandra.jai.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitfromConfiguration(String[] args) {

		return new LimitConfiguration(configuration.getMinimun(),configuration.getMaximun());
	}

}
