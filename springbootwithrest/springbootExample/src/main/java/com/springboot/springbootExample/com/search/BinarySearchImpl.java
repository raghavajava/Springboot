package com.springboot.springbootExample.com.search;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springbootExample.com.sort.Isort;
@Component
public class BinarySearchImpl {
	
	public BinarySearchImpl(Isort serachSort) {
		super();
		this.serachSort=serachSort;
	}
	
	
	Isort serachSort;
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean isPresent(int[] array,int noTobeSearched) {
		
		System.out.println("Performing Search");
		//serachSort.sort(array);
		System.out.println("Provide no to be  Search : " + noTobeSearched  + "array : " + array);
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==noTobeSearched) {
				return true;
			}
			
		}
		return false;
	}
	

}
