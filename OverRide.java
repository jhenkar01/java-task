package com.xworkz.achive_inheritance.things;

public class OverRide {
	
	public int no;
	private  String name;
	
	

	public OverRide() {
		
		System.out.println("achive over ride");
	}

	@Override
	public String toString() {
		return "OverRide [no=" + no + ", name=" + name +  "]";
	}

	public void setint(int no) {
		
		this.no = no;
	}
   
	public int getint() {
		
		return no;
	}
	
	public void nothing() {
		
		System.out.println("achive method overriding");
	}
	public void nothing(int go) {
		
		System.out.println(go);
	}
	public String nothing1() {
		return "ok";
	}
	public String nothing1(int token) {
		
		System.out.println(token);
		return "done";
	}
public void nothing(int go,float val) {
		
		System.out.println(go);
		System.out.println(val);
	}
public String nothing1(int val,float no1) {
	System.out.println(val);
	System.out.println(no1);
	return "ok";
}
public void news(int no,boolean yes) {
	
	System.out.println(no);
	System.out.println(yes);
}
public boolean movie(int no) {
	
	System.out.println(no);
	return true;
}
public float cinema(char letter) {
	System.out.println(letter);
	return 4.5f;
}
public char hero(boolean yes) {
	System.out.println(yes);
	return 'k';
}
	
}
