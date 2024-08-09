package com.xworkz.achive_inheritance.things;

public class Achive_inherit {
	
	private int no;
	private String name;
	private float length;
	private boolean yes;
	
	public Achive_inherit() {
		
		System.out.println("achive inherit");
	}
	
	public Achive_inherit(int no,String name) {
		
		this (12,"hello",45.5f);
		
		this.no = no;
		this.name = name;
		System.out.println(no);
		System.out.println(name);
	}
	public Achive_inherit(int no,String name,float length) {
		
		this.no = no;
		this.name = name;
		this.length = length;
		System.out.println(no);
		System.out.println(name);
		System.out.println(length);
		
	}
	
	
	public void setint(int no) {
		
		this.no = no;
	}
   public int getint() {
	   
	   return no;	   
	   
   }
   public void setString(String name) {
	   
	   this.name = name;
   }
   public String getString() {
	   
	   return name;
   }
   public void setfloat(float length) {
	   
	   this.length = length;
   }
   public float getfloat() {
	   
	   return length;
   }
   public void setboolean(boolean yes) {
	   
	   this.yes = yes;
   }
   public boolean getboolean() {
	   
	   return yes;
   }
}
