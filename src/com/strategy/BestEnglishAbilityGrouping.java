package com.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.model.Leaf;

public class BestEnglishAbilityGrouping implements IStrategy {

	@Override
	public void grouping() {
		
		System.out.println("~~~grouping~~~");
		
	}

	@Override
	public void setList(List<Leaf> leafList) {
		
		String[] group = new String[5];
		
		/* ��l�Ƭ�"�Ŧr��" */
		for(int i = 0; i < 5; i++) {
			group[i] = "";
		}
		
		System.out.println(leafList.get(0));
		
		for(int i = 0; i < 5; i++) {
			group[i] += leafList.get(i);
		}
		
//		group01 += leafList.get(0);
//		group02 += leafList.get(1);
//		group03 += leafList.get(2);
//		group04 += leafList.get(3);
//		group05 += leafList.get(4);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("�w�[�J String : " + group[i]);
		}
		
//		System.out.println("�w�[�J String : " + group01);
//		System.out.println("�w�[�J String : " + group02);
//		System.out.println("�w�[�J String : " + group03);
//		System.out.println("�w�[�J String : " + group04);
//		System.out.println("�w�[�J String : " + group05);
		
		int index = 1;
		int randomMax = 50;
		int randomIndex = 0;
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i = index; i < randomMax; i++) {
			random.add(i);
		}
		
		System.out.println("�ڦ� : " + random.size());
		
		int count = 1;
		int groupIndex = 0;
		while(random.size() != 0) {
			randomIndex = rand.nextInt(randomMax--);
			System.out.println("�üƪ��ڡA�n���� " + randomIndex + " ���Ʀr");
			try {
				if(random.get(randomIndex) >= 5) {
					System.out.println("index " + index + " : " + random.get(randomIndex));
					if(count <= 8) {
						group[groupIndex] += "�B" + leafList.get(randomIndex);
						count++;
					} else {
						count = 1;
						groupIndex++;
					}
					random.remove(randomIndex);
				} else {
//					System.out.println("����e 5 �W�F�I");
					random.remove(randomIndex);
				}
			} catch(IndexOutOfBoundsException e) {
				System.out.println("�U�нd��V�ɡI");
			} catch(IllegalArgumentException e) {
				System.out.println("�ѼƲ��`�I");
			}
			index++;
		}
		
		System.out.println("���٦� : " + random.size());
		
		for(int i = 0; i < 5; i++) {
			System.out.println("�� " + (i + 1) + " �� : " + group[i]);
		}
		
		
		
//		System.out.println(leafList);
	}

}
