package com.skyscapperArrangement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ArrangeFloorsOfSkyscrapper {

	public void calculateAndPrintOrderOfConstruction(Integer[] totalFloorSize) {
		System.out.println("The order of construction is as follows");

		int j = 0;
		Integer[] totalFloorSizeSorted = totalFloorSize.clone();
		Arrays.sort(totalFloorSizeSorted, Collections.reverseOrder());

		Stack<Integer> myStack = new Stack<Integer>();

		for (int i = 0; i < totalFloorSize.length; i++) {
			if (totalFloorSize[i] == totalFloorSizeSorted[j]) {
				if (i == totalFloorSize.length - 1)
					j = i;
				else
					j = i + 1;
				
				System.out.println("Day: " + (i + 1));
				if (myStack != null) {
					System.out.print(totalFloorSize[i] + " ");
					while (!myStack.isEmpty()) {
						Collections.sort(myStack);

						int val = myStack.pop();
						if (val >= totalFloorSizeSorted[j]) {
							System.out.print(val + " ");
						} else {
							myStack.push(val);
							j -= myStack.size();
							break;
						}
					}
					System.out.println("");
				} else {
					System.out.println(totalFloorSize[i]);
				}
			} else
			{
				System.out.println("Day: " + (i + 1));
				myStack.push(totalFloorSize[i]);
			}
		}
	}
}
