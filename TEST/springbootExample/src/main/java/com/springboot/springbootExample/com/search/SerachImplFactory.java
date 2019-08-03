package com.springboot.springbootExample.com.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.springbootExample.com.sort.BubbleSortSearch;
import com.springboot.springbootExample.com.sort.QuickSortSearch;

@Configuration
public class SerachImplFactory {
	@Autowired
	BubbleSortSearch bubbleSortSearch;
	
	@Autowired
	QuickSortSearch quickSortSearch;
	
	
	@Bean
	public BinarySearchImpl bubbleSortBinearySearchImpl() {
		return new BinarySearchImpl(bubbleSortSearch);
		
	}
	
	
	@Bean
	public BinarySearchImpl quickSortBinearySearchImpl() {
		return new BinarySearchImpl(quickSortSearch);
		
	}

}
