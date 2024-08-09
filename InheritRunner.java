package com.xworkz.achive_inheritance.runner;

import com.xworkz.achive_inheritance.things.Achive_inherit;

public class InheritRunner {
	
	public static void main(String args[]) {
		
		Achive_inherit achive = new Achive_inherit ();
		
//Achive_inherit achive1= new Achive_inherit (10,"hi");
		
		Achive_inherit achiv2= new Achive_inherit (20,"i",23.5f);
		
		
		
		
		
		
		achive.setint(12);
		achive.getint();
		System.out.println(achive.getint());
		
		
		
		achive.setString("heloo");
		achive.getString();
		System.out.println(achive.getString());
		
		
		achive.setfloat(34.5f);
		achive.getfloat();
		System.out.println(achive.getfloat());
		
		achive.setboolean(true);
		achive.getboolean();
		System.out.println(achive.getboolean());
		

		
}
}
