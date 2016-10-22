package com.model;

import java.util.Random;
import com.iterator.StudentIterator;

public class Client {

	public static void main(String[] args) {
		
		/* �����H���� */
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
		
		/* ��ܽҵ{ */
		System.out.println("�ҵ{ : " + course.getInfo());
		
		/* ��ܼh�� */
		System.out.println("�Ǩ� : " + type1.getInfo());
		
		/* ��ܤG�ަ@���X�Ӿǥ� */
		System.out.println("���Z���G�޾ǥͤH�Ʀ@�� : " + type1.getLength());
		
		/* ��ܼh�� */
		System.out.println("�Ǩ� : " + type2.getInfo());
		
		/* ��ܥ|�ަ@���X�Ӿǥ� */
		System.out.println("���Z���|�޾ǥͤH�Ʀ@�� : " + type2.getLength());
		
		System.out.println("----------------------------");
		
		StudentIterator courseIterator = (StudentIterator) course.getIterator();
		StudentIterator type1Iterator = (StudentIterator) type1.getIterator();
		StudentIterator type2Iterator = (StudentIterator) type2.getIterator();
		
		
		while(courseIterator.hasNext()) {
			College item = courseIterator.next();
			System.out.println("--" + item.getInfo());
		}
		
		while(type1Iterator.hasNext()) {
			College item = type1Iterator.next();
			System.out.println("--" + item.getInfo());
		}
		
		while(type2Iterator.hasNext()) {
			College item = type2Iterator.next();
			System.out.println("--" + item.getInfo());
		}
		
		System.out.println("----------------------------");
		
//		while (courseIterator.hasNext()) {
//			System.out.println("��");
//			System.out.println(courseIterator.next());
//		}
//		
//		while (courseIterator.hasNext()) {
//			System.out.println("��");
//			System.out.println(courseIterator.next());
//		}
		
	}

}
