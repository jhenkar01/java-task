package com.google.achiveinheritace.runner;

import com.google.achiveinheritace.things.HybridInherit;
import com.google.achiveinheritace.things.HybridInherit1;
import com.google.achiveinheritace.things.HybridInherit2;
import com.google.achiveinheritace.things.HybridInherit3;

public class HybridRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HybridInherit hybrid = new HybridInherit ();
		hybrid.name = "dasegowda";
		hybrid.no = 1;
		System.out.println(hybrid.name);
		System.out.println(hybrid.no);
		hybrid.grandfather();
		
		HybridInherit1 hybrid1 = new  HybridInherit1 ();
		
		hybrid1.name1 = "narayana";
		hybrid1.no1 = 2;
		System.out.println(hybrid1.name1);
		System.out.println(hybrid1.no1);
		hybrid1.father();
		
		HybridInherit2 hybrid2 = new HybridInherit2();
		
		hybrid2.name2 = "jhenkar";
		hybrid2.no2 = 3;
		System.out.println(hybrid2.name2);
		System.out.println(hybrid2.no2);
		hybrid2.son();
		
		HybridInherit3 hybrid3 = new HybridInherit3();
		hybrid3.name3 = "sonu";
		hybrid3.no3 = 4;
		System.out.println(hybrid3.name3);
		System.out.println(hybrid3.no3);
		hybrid3.daughter();
		
		
		
		
	}

}
