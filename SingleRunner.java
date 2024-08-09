package com.xworkz.achive_inheritance.runner;

import com.xworkz.achive_inheritance.things.AchiveSingle;
import com.xworkz.achive_inheritance.things.AchiveSubSingle;

public class SingleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AchiveSingle achive = new AchiveSingle();
		
		achive.length = 12.4f;
		System.out.println(achive.length);
		achive.namel = "hi";
		System.out.println(achive.namel);
		achive.no = 45;
		System.out.println(achive.no);
		achive.car();
		
		AchiveSubSingle sub = new AchiveSubSingle();
		
		sub.given = "heloo";
		System.out.println(sub.given);
		sub.length = 12;
		System.out.println(sub.length);
		sub.yes = true;
		System.out.println(sub.yes);
		sub.bike();
		
	}

}
