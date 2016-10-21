package com.model;

import java.util.Random;
import com.iterator.IStudentIterator;

public class Client {

	public static void main(String[] args) {
		
		/* 產生隨機值 */
		Random rand = new Random();
		
		Hierarchy course = new Hierarchy("OOSE");
		Hierarchy type1 = new Hierarchy("TwoYearCollege");
		Hierarchy type2 = new Hierarchy("FourYearCollege");
		
		Leaf leaf1 = new Leaf("A10423001", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf2 = new Leaf("A10423002", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf3 = new Leaf("A10423003", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf4 = new Leaf("A10423004", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf5 = new Leaf("A10423005", rand.nextInt(100), rand.nextInt(100));
		
		course.add(type1);
		course.add(type2);
		
		type1.add(leaf1);
		type1.add(leaf2);
		type2.add(leaf3);
		type2.add(leaf4);
		type2.add(leaf5);
		
		/* 顯示課程 */
		System.out.println("課程 : " + course.getInfo());
		
		/* 顯示層級 */
		System.out.println("學制 : " + type1.getInfo());
		
		/* 顯示二技共有幾個學生 */
		System.out.println("此班的二技學生人數共有 : " + type1.getLength());
		
		/* 顯示層級 */
		System.out.println("學制 : " + type2.getInfo());
		
		/* 顯示四技共有幾個學生 */
		System.out.println("此班的四技學生人數共有 : " + type2.getLength());
		
		System.out.println("----------------------------");
		
		IStudentIterator courseIterator = course.getIterator();
		
		while(courseIterator.hasNext()) {
			College item = (College)courseIterator.next();
			System.out.println("--" + item.getInfo());
		}

	}

}
