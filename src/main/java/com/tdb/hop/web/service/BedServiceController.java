package com.tdb.hop.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class BedServiceController {

	
	// Return last 24 hours in a JSON object
	@Autowired
	private BedServiceController bedServiceController;
	
}
