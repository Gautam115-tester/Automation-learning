package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(-99);
		list.add(1000);
		list.add(0);
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
