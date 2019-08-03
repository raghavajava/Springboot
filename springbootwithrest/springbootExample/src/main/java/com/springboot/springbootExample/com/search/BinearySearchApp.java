package com.springboot.springbootExample.com.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinearySearchApp {
	
@Autowired
BinarySearchImpl bubbleSortBinearySearchImpl;
@Autowired
BinarySearchImpl quickSortBinearySearchImpl;
	
	public boolean search(int noTobeSearched) {
		int[] inputArray= {1,2,3,4,5};
		return performBubbleSortBasedSearch(inputArray,noTobeSearched);
		//performQuickSortBasedSearch(inputArray,noTobeSearched);
		//return true;
		
		
	}
	
	private boolean performBubbleSortBasedSearch(int[] sourceNo , int noTobeSearched) {
		System.out.println("performBubbleSortBasedSearch : " + noTobeSearched + "sourceNo : " + sourceNo);
		
		boolean isPresent=bubbleSortBinearySearchImpl.isPresent(sourceNo, noTobeSearched);
		System.out.println("completed search with bubble sort result is :" + isPresent);
		return isPresent;
		
	}
	
	private void performQuickSortBasedSearch(int[] sourceNo,int noTobeSearched) {
		
		boolean isPresent=quickSortBinearySearchImpl.isPresent(sourceNo, noTobeSearched);
		System.out.println("completed search with quick sort result is :" + isPresent);
		
	}	
}
