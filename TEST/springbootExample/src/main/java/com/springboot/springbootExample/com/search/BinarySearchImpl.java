package com.springboot.springbootExample.com.search;

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
	
	public boolean isPresent(int[] array,int serachNo) {
		System.out.println("Inside Binary Search");
		System.out.println("Performing Search");
		serachSort.sort(array);
		return true;
	}
	

}
