package com.springboot.springbootExample.com.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinearySearchApp {
	
@Autowired
BinarySearchImpl bubbleSortBinearySearchImpl;
@Autowired
BinarySearchImpl quickSortBinearySearchImpl;
	
	public void search() {
		int[] inputArray= {10,20,6,8};
		performBubbleSortBasedSearch(inputArray);
		performQuickSortBasedSearch(inputArray);
		
		
	}
	
	private void performBubbleSortBasedSearch(int[] sourceNo) {
		
		boolean isPresent=bubbleSortBinearySearchImpl.isPresent(sourceNo, 8);
		System.out.println("completed search with bubble sort result is :" + isPresent);
		
	}
	
	private void performQuickSortBasedSearch(int[] sourceNo) {
		
		boolean isPresent=quickSortBinearySearchImpl.isPresent(sourceNo, 8);
		System.out.println("completed search with quick sort result is :" + isPresent);
		
	}	
}
