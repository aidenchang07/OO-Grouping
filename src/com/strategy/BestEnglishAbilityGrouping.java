package com.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.model.Leaf;

public class BestEnglishAbilityGrouping implements IStrategy {

	@Override
	public void grouping(List<Leaf> leafList) {
		
		/* �i��ƲձƧ� */
		Collections.sort(leafList);
		
		String[] group = new String[5];
		
		/* ��l�Ƭ�"�Ŧr��" */
		for(int i = 0; i < 5; i++) {
			group[i] = "";
		}
		
		/* ���աA�ϧ_����X�� 1 ��ǥ͸�T */
//		System.out.println(leafList.get(0));
		
		/* ��̰������o 5 ��A�̧ǦU�ө�J�� 1 ~ 5 �� */
		for(int i = 0; i < 5; i++) {
			group[i] += leafList.get(i);
		}
		
		/* ���աA�C�X�o 5 �ժ��̰��� */
//		for(int i = 0; i < 5; i++) {
//			System.out.println("�� " + (i + 1) + " �� : " + group[i]);
//		}
		
		/* �q 0 �}�l�A�p�G�]�� 1 �|�U�жV�� */
		int index = 0;
		/* ������ 50 �� */
		int randomMax = 50;
		int randomIndex = 0;
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i = index; i < randomMax; i++) {
			random.add(i);
		}
		
		/* ���աA��ܶüƥΪ� ArrayList�A�@���X�ո��(�ϥΫe) */
//		System.out.println("�üƥΪ� ArrayList ���� " + random.size() + " �ո��");
		
		/**
		 * �H�U�ĥ�"�üƤ�����"���޳N�ө�ǥ�
		 */
		int count = 1;
		int groupIndex = 0;
		while(random.size() != 0) {
			randomIndex = rand.nextInt(randomMax--);
			
			/* ���աA��ܥثe�w����ĴX�Ӫ��Ʀr */
//			System.out.println("�üƪ��ڡA�n���� " + randomIndex + " ���Ʀr");
			
			try {
				if(random.get(randomIndex) >= 5) {
					
					/* ���աA��ܱN�n���o���Ʀr */
//					System.out.println("index " + index + " : " + random.get(randomIndex));
					
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
		
		/* ���աA��ܶüƥΪ� ArrayList�A�@���X�ո��(�w�ϥ�) */
//		System.out.println("�üƥΪ� ArrayList ���� " + random.size() + " �ո��");
		
		/* �C�X�o 5 �ժ����� */
		for(int i = 0; i < 5; i++) {
			System.out.println("�� " + (i + 1) + " �� : " + group[i]);
		}
		
	}

}
