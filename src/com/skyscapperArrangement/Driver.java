package com.skyscapperArrangement;


import java.util.Arrays;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {
    	 System.out.println("enter the total no of floors in the building");
         Scanner sc = new Scanner(System.in);
        int totalFloors = sc.nextInt();
        Integer[] totalFloorSize = new Integer[totalFloors];

         for (int i = 0; i < totalFloors; i++) {
             System.out.println("enter the floor size given on day : " + (i+1));
             totalFloorSize[i] = sc.nextInt();
         }
        ArrangeFloorsOfSkyscrapper arrange =new ArrangeFloorsOfSkyscrapper();
        
        arrange.calculateAndPrintOrderOfConstruction(totalFloorSize);
    }
}
