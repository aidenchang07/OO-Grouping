package com.model;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		
		/* ²£¥ÍÀH¾÷­È */
		Random rand = new Random();
		
		TwoYearCollege leaf1 = new TwoYearCollege("A10423001", rand.nextInt(100), rand.nextInt(100));
		TwoYearCollege leaf2 = new TwoYearCollege("A10423002", rand.nextInt(100), rand.nextInt(100));
		
		FourYearCollege leaf3 = new FourYearCollege("A10423003", rand.nextInt(100), rand.nextInt(100));
		FourYearCollege leaf4 = new FourYearCollege("A10423004", rand.nextInt(100), rand.nextInt(100));
		
		

	}

}
