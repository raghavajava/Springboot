package com.springboot.springbootExample.com.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortSearch implements Isort{
	@Override
	public void sort(int[] searchNoToBeSorted) {
		System.out.println("Completed searching using quick sort");
	
	}

}
