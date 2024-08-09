package com.xworkz.achive_inheritance.runner;

import com.xworkz.achive_inheritance.things.OverRide;
import com.xworkz.achive_inheritance.things.OverSub;

public class OverRidingRunner {
	
	public static void main(String args[]) {
		
		OverRide over = new OverRide();
		over.no = 5;
		over.setint(8);
		System.out.println(over.getint());
	
		
		OverSub sub = new OverSub();
		sub.names = "naresh";
		sub.valuel = 9;
		sub.nothing();
		sub.nothing(7);
	System.out.println(	sub.nothing1());
	System.out.println(sub.nothing1(12));
		sub.nothing(12,6.7f);
	     sub.nothing1(45,7.8f);
	     sub.movie(1);
	     sub.cinema('i');
	     sub.hero(false);
	}
	


}
