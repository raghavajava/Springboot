package com.springboot.springbootExample.com.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
	@Autowired
	BinearySearchApp binearySearchApp; 
	
	@GetMapping("/search/{noToBeSearched}")
	public boolean isNumberPrest(@PathVariable int noToBeSearched) {
		return binearySearchApp.search(noToBeSearched);
	}

}
