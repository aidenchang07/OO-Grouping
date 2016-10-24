package com.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import com.iterator.StudentIterator;
import com.strategy.BestEnglishAbilityGrouping;
import com.strategy.BestProgramAbilityGrouping;
import com.strategy.ContextStrategy;

public class Client {

	public static void main(String[] args) {
		
		ContextStrategy contextStrategy;
		
		Hierarchy course = getCourseTree();
		
//		System.out.println(course.getInfo());
		
//		System.out.println("學號 , 英文能力, 程式能力");
		
//		System.out.println(getTreeInfo(course));
		
		Random rand = new Random();
		
		/* 修此門課的所有學生 */
		Leaf leaf01 = new Leaf("A10423001", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf02 = new Leaf("A10423002", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf03 = new Leaf("A10423003", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf04 = new Leaf("A10423004", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf05 = new Leaf("A10423005", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf06 = new Leaf("A10423006", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf07 = new Leaf("A10423007", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf08 = new Leaf("A10423008", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf09 = new Leaf("A10423009", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf10 = new Leaf("A10423010", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf11 = new Leaf("A10423011", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf12 = new Leaf("A10423012", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf13 = new Leaf("A10423013", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf14 = new Leaf("A10423014", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf15 = new Leaf("A10423015", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf16 = new Leaf("A10423016", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf17 = new Leaf("A10423017", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf18 = new Leaf("A10423018", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf19 = new Leaf("A10423019", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf20 = new Leaf("A10423020", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf21 = new Leaf("A10423021", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf22 = new Leaf("A10423022", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf23 = new Leaf("A10423023", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf24 = new Leaf("A10423024", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf25 = new Leaf("A10423025", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf26 = new Leaf("A10423026", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf27 = new Leaf("A10423027", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf28 = new Leaf("A10423028", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf29 = new Leaf("A10423029", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf30 = new Leaf("A10423030", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf31 = new Leaf("A10423031", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf32 = new Leaf("A10423032", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf33 = new Leaf("A10423033", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf34 = new Leaf("A10423034", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf35 = new Leaf("A10423035", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf36 = new Leaf("A10423036", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf37 = new Leaf("A10423037", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf38 = new Leaf("A10423038", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf39 = new Leaf("A10423039", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf40 = new Leaf("A10423040", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf41 = new Leaf("A10423041", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf42 = new Leaf("A10423042", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf43 = new Leaf("A10423043", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf44 = new Leaf("A10423044", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf45 = new Leaf("A10423045", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf46 = new Leaf("A10423046", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf47 = new Leaf("A10423047", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf48 = new Leaf("A10423048", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf49 = new Leaf("A10423049", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf50 = new Leaf("A10423050", rand.nextInt(100), rand.nextInt(100));

		List<Leaf> studentList = Arrays.asList(
				leaf01,
				leaf02,
				leaf03,
				leaf04,
				leaf05,
				leaf06,
				leaf07,
				leaf08,
				leaf09,
				leaf10,
				leaf11,
				leaf12,
				leaf13,
				leaf14,
				leaf15,
				leaf16,
				leaf17,
				leaf18,
				leaf19,
				leaf20,
				leaf21,
				leaf22,
				leaf23,
				leaf24,
				leaf25,
				leaf26,
				leaf27,
				leaf28,
				leaf29,
				leaf30,
				leaf31,
				leaf32,
				leaf33,
				leaf34,
				leaf35,
				leaf36,
				leaf37,
				leaf38,
				leaf39,
				leaf40,
				leaf41,
				leaf42,
				leaf43,
				leaf44,
				leaf45,
				leaf46,
				leaf47,
				leaf48,
				leaf49,
				leaf50);
		
		System.out.println("---------------依照英文能力分組---------------");
		
		contextStrategy = new ContextStrategy(new BestEnglishAbilityGrouping());
		
		contextStrategy.grouping(studentList);
		
		System.out.println("---------------依照程式能力分組---------------");
		
		contextStrategy = new ContextStrategy(new BestProgramAbilityGrouping());
		
		contextStrategy.grouping(studentList);
		
	}
	
	public static Hierarchy getCourseTree() {
		/* 產生隨機值 */
		Random rand = new Random();
		
		/* 課程名稱 */
		Hierarchy course = new Hierarchy("OOSE");
		
		/* 分2種學生，一種是二技生，另一種是四技生 */
		Hierarchy twoYearCollege = new Hierarchy("TwoYearCollege");
		Hierarchy fourYearCollege = new Hierarchy("FourYearCollege");
		
		/* 修此門課的所有學生 */
		Leaf leaf01 = new Leaf("A10423001", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf02 = new Leaf("A10423002", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf03 = new Leaf("A10423003", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf04 = new Leaf("A10423004", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf05 = new Leaf("A10423005", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf06 = new Leaf("A10423006", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf07 = new Leaf("A10423007", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf08 = new Leaf("A10423008", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf09 = new Leaf("A10423009", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf10 = new Leaf("A10423010", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf11 = new Leaf("A10423011", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf12 = new Leaf("A10423012", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf13 = new Leaf("A10423013", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf14 = new Leaf("A10423014", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf15 = new Leaf("A10423015", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf16 = new Leaf("A10423016", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf17 = new Leaf("A10423017", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf18 = new Leaf("A10423018", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf19 = new Leaf("A10423019", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf20 = new Leaf("A10423020", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf21 = new Leaf("A10423021", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf22 = new Leaf("A10423022", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf23 = new Leaf("A10423023", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf24 = new Leaf("A10423024", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf25 = new Leaf("A10423025", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf26 = new Leaf("A10423026", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf27 = new Leaf("A10423027", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf28 = new Leaf("A10423028", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf29 = new Leaf("A10423029", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf30 = new Leaf("A10423030", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf31 = new Leaf("A10423031", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf32 = new Leaf("A10423032", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf33 = new Leaf("A10423033", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf34 = new Leaf("A10423034", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf35 = new Leaf("A10423035", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf36 = new Leaf("A10423036", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf37 = new Leaf("A10423037", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf38 = new Leaf("A10423038", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf39 = new Leaf("A10423039", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf40 = new Leaf("A10423040", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf41 = new Leaf("A10423041", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf42 = new Leaf("A10423042", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf43 = new Leaf("A10423043", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf44 = new Leaf("A10423044", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf45 = new Leaf("A10423045", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf46 = new Leaf("A10423046", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf47 = new Leaf("A10423047", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf48 = new Leaf("A10423048", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf49 = new Leaf("A10423049", rand.nextInt(100), rand.nextInt(100));
		Leaf leaf50 = new Leaf("A10423050", rand.nextInt(100), rand.nextInt(100));
		
		/* 開始組織架構 */
		/* 修OOSE的學生分為二技生和四技生 */
		course.add(twoYearCollege);
		course.add(fourYearCollege);
		
		/* 共有50位學生 */
		twoYearCollege.add(leaf01);
		twoYearCollege.add(leaf02);
		twoYearCollege.add(leaf03);
		twoYearCollege.add(leaf04);
		twoYearCollege.add(leaf05);
		twoYearCollege.add(leaf06);
		twoYearCollege.add(leaf07);
		twoYearCollege.add(leaf08);
		twoYearCollege.add(leaf09);
		twoYearCollege.add(leaf10);
		twoYearCollege.add(leaf11);
		twoYearCollege.add(leaf12);
		twoYearCollege.add(leaf13);
		twoYearCollege.add(leaf14);
		twoYearCollege.add(leaf15);
		twoYearCollege.add(leaf16);
		twoYearCollege.add(leaf17);
		twoYearCollege.add(leaf18);
		twoYearCollege.add(leaf19);
		twoYearCollege.add(leaf20);
		fourYearCollege.add(leaf21);
		fourYearCollege.add(leaf22);
		fourYearCollege.add(leaf23);
		fourYearCollege.add(leaf24);
		fourYearCollege.add(leaf25);
		fourYearCollege.add(leaf26);
		fourYearCollege.add(leaf27);
		fourYearCollege.add(leaf28);
		fourYearCollege.add(leaf29);
		fourYearCollege.add(leaf30);
		fourYearCollege.add(leaf31);
		fourYearCollege.add(leaf32);
		fourYearCollege.add(leaf33);
		fourYearCollege.add(leaf34);
		fourYearCollege.add(leaf35);
		fourYearCollege.add(leaf36);
		fourYearCollege.add(leaf37);
		fourYearCollege.add(leaf38);
		fourYearCollege.add(leaf39);
		fourYearCollege.add(leaf40);
		fourYearCollege.add(leaf41);
		fourYearCollege.add(leaf42);
		fourYearCollege.add(leaf43);
		fourYearCollege.add(leaf44);
		fourYearCollege.add(leaf45);
		fourYearCollege.add(leaf46);
		fourYearCollege.add(leaf47);
		fourYearCollege.add(leaf48);
		fourYearCollege.add(leaf49);
		fourYearCollege.add(leaf50);
		
		return course;
	}

	public static String getTreeInfo(Hierarchy root) {
		StudentIterator studentList = root.getIterator();
		String info = "";
		while(studentList.hasNext()) {
			College s = (College)studentList.next();
			if(s instanceof Leaf) {
				info = info + s.getInfo() + "\n";
			} else {
				info = info + s.getInfo() + "\n" + getTreeInfo((Hierarchy) s);
			}
		}
		return info;
	}
	
}
