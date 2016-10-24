package com.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.model.Leaf;

public class BestEnglishAbilityGrouping implements IStrategy {

	@Override
	public void grouping(List<Leaf> leafList) {
		
		/* 進行數組排序 */
		Collections.sort(leafList);
		
		String[] group = new String[5];
		
		/* 初始化為"空字串" */
		for(int i = 0; i < 5; i++) {
			group[i] = "";
		}
		
		/* 測試，使否能取出第 1 位學生資訊 */
//		System.out.println(leafList.get(0));
		
		/* 把最高分的這 5 位，依序各個放入第 1 ~ 5 組 */
		for(int i = 0; i < 5; i++) {
			group[i] += leafList.get(i);
		}
		
		/* 測試，列出這 5 組的最高分 */
//		for(int i = 0; i < 5; i++) {
//			System.out.println("第 " + (i + 1) + " 組 : " + group[i]);
//		}
		
		/* 從 0 開始，如果設為 1 會下標越界 */
		int index = 0;
		/* 限制抽取 50 次 */
		int randomMax = 50;
		int randomIndex = 0;
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i = index; i < randomMax; i++) {
			random.add(i);
		}
		
		/* 測試，顯示亂數用的 ArrayList，共有幾組資料(使用前) */
//		System.out.println("亂數用的 ArrayList 內有 " + random.size() + " 組資料");
		
		/**
		 * 以下採用"亂數不重複"的技術來抽學生
		 */
		int count = 1;
		int groupIndex = 0;
		while(random.size() != 0) {
			randomIndex = rand.nextInt(randomMax--);
			
			/* 測試，顯示目前已取到第幾個的數字 */
//			System.out.println("亂數的我，要取第 " + randomIndex + " 的數字");
			
			try {
				if(random.get(randomIndex) >= 5) {
					
					/* 測試，顯示將要取得的數字 */
//					System.out.println("index " + index + " : " + random.get(randomIndex));
					
					if(count <= 8) {
						group[groupIndex] += "、" + leafList.get(randomIndex);
						count++;
					} else {
						count = 1;
						groupIndex++;
					}
					random.remove(randomIndex);
				} else {
//					System.out.println("取到前 5 名了！");
					random.remove(randomIndex);
				}
			} catch(IndexOutOfBoundsException e) {
				System.out.println("下標範圍越界！");
			} catch(IllegalArgumentException e) {
				System.out.println("參數異常！");
			}
			index++;
		}
		
		/* 測試，顯示亂數用的 ArrayList，共有幾組資料(已使用) */
//		System.out.println("亂數用的 ArrayList 內有 " + random.size() + " 組資料");
		
		/* 列出這 5 組的成員 */
		for(int i = 0; i < 5; i++) {
			System.out.println("第 " + (i + 1) + " 組 : " + group[i]);
		}
		
	}

}
