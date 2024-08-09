package com.google.achiveinheritace.runner;

import com.google.achiveinheritace.things.HierarchyInherit;
import com.google.achiveinheritace.things.HirrarchyIherit2;
import com.google.achiveinheritace.things.HirrarchyInherit1;

public class HirrarchyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchyInherit hierarchy = new HierarchyInherit();
		hierarchy.name = "narayana";
		hierarchy.no = 1;
		System.out.println(hierarchy.name);
		System.out.println(hierarchy.no);
		
		
		 HirrarchyInherit1 hierarchy1 = new  HirrarchyInherit1 ();
		 hierarchy1.name1 = "jhenkar";
		 hierarchy1.no1 = 2;
		 System.out.println(hierarchy1.name1);
		 System.out.println(hierarchy1.no1);
		 
		 HirrarchyIherit2  hierarchy2 = new HirrarchyIherit2();
		 hierarchy2.name2 = "sonu";
		 hierarchy2.no2 = 3;
		 System.out.println(hierarchy2.name2);
		 System.out.println(hierarchy2.no2);
		 
		

	}

}
