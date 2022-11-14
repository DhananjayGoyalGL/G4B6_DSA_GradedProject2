package com.greatlearning.project2.architect;

import java.util.Scanner;

public class driver {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
	        System.out.println("enter the total no of floors in the building");

	        int noOffloor = sc.nextInt();
	 
	        int[] floors = new int[noOffloor];

			for (int i = 0; i < noOffloor; i++) {
				                   
			     System.out.println("Enter the floor size given on day : " + (i + 1));
					            
			     floors[i] = sc.nextInt();
		  }
				
			      System.out.println();

			            	Architect B = new Architect();
			             	B.structure(floors, noOffloor);
			sc.close();
			              
		          
	      }
}

