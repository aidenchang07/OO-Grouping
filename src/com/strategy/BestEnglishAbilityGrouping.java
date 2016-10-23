package com.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BestEnglishAbilityGrouping implements IStrategy {
	
	private ArrayList<String> list = new ArrayList<String>();
	
	private String delimiter =  ",";

	@Override
	public void grouping(String studentList) {
		
//		System.out.print(studentList);
		
		String[] tokens = studentList.split(delimiter);
		
		for(String token : tokens) {
			list.add(token);
//			System.out.println(token);
		}
		
		list.remove("TwoYearCollege");
		list.remove("FourYearCollege");
		
		for(String token : list) {
			System.out.println(token);
		}
		
		System.out.println("============以下是英文排序前資料==========");
		
		ArrayList<String> id = new ArrayList<String>();
		ArrayList<Integer> englishAbility = new ArrayList<Integer>();
		ArrayList<Integer> programAbility = new ArrayList<Integer>();
		
		for (int i = 1; i < 150; i += 3) {
			englishAbility.add(Integer.parseInt(list.get(i)));
//			System.out.println("i = " + i);
		}
		
		for(Integer token : englishAbility) {
			System.out.println(token);
		}
		
//		String s = englishAbility.remove();
//		System.out.println("look : " + s);
		
		System.out.println("============以下是英文排序後資料==========");
		
		Collections.sort(englishAbility, Collections.reverseOrder());
		
		for(Integer token : englishAbility) {
			System.out.println(token);
		}
		
//		Integer s1 = englishAbility.get(3);
//		System.out.println("look : " + s1);
		
		System.out.println("============以下是學號的資料==========");
		
		for (int i = 0; i < 150; i += 3) {
			id.add(list.get(i));
//			System.out.println("i = " + i);
		}
		
		for(String token : id) {
			System.out.println(token);
		}
		
		System.out.println("============以下是程式排序前的資料==========");
		
		for (int i = 2; i < 150; i += 3) {
			programAbility.add(Integer.parseInt(list.get(i)));
//			System.out.println("i = " + i);
		}
		
		for(Integer token : programAbility) {
			System.out.println(token);
		}
		
		System.out.println("============以下是程式排序後的資料==========");
		
		Collections.sort(programAbility, Collections.reverseOrder());
		
		for(Integer token : programAbility) {
			System.out.println(token);
		}
		
		System.out.println("============以下是測試亂數抽取資料==========");
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		/* 分5組 */
		ArrayList<String> group01 = new ArrayList<String>();
		ArrayList<String> group02 = new ArrayList<String>();
		ArrayList<String> group03 = new ArrayList<String>();
		ArrayList<String> group04 = new ArrayList<String>();
		ArrayList<String> group05 = new ArrayList<String>();
		
		Random rand = new Random();
		
		for(int i = 0; i < 100; i++) {
			random.add(i);
		}
		
		int index = 0;
		int indexs = 100;
		int rands = 0;
		
		System.out.println("我有 : " + random.size());
		
		while(random.size() != 0) {
			index++;
			rands = rand.nextInt(indexs--);
			System.out.println("亂數的我，要取第 " + rands + " 的數字");
			System.out.println("index " + index + " : " + random.get(rands));
			random.remove(rands);
		}
		
		System.out.println("我還有 : " + random.size());
		
		String[] s1 = new String[3];
//		for( int i = 0; i < s1.length; i++) {
//			s1[i] = String.valueOf(englishAbility.get(index)); //英文最高分
//		}
		s1[0] = String.valueOf(id.get(2));
		s1[1] = String.valueOf(englishAbility.get(2));
		s1[2] = String.valueOf(programAbility.get(2));
		
		System.out.println("一組String : " + s1.toString());
		
//		englishAbility.get(index); //英文最高分
//		id.get(rands);
//		programAbility.get(rands);
		
		
	}

}
