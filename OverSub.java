package com.xworkz.achive_inheritance.things;

public class OverSub extends  OverRide{
	
	public int valuel;
	public String names;
	
	
public void nothing() {
		
		System.out.println("achive method overriding");
	}
@Override
public void nothing(int go) {
	
	System.out.println(go);
}
@Override
public String nothing1() {
	return "ok";
}
@Override
public String nothing1(int token) {
	
	System.out.println(token);
	return "done";
}
@Override
public void nothing(int go,float val) {
	
	System.out.println(go);
	System.out.println(val);
}
@Override
public String nothing1(int val,float no1) {
	System.out.println(val);
	System.out.println(no1);
	return "ok";
}
@Override
public boolean movie(int no) {
	
	System.out.println(no);
	return true;
}
@Override
public float cinema(char letter) {
	System.out.println(letter);
	return 4.5f;
}
@Override
public char hero(boolean yes) {
	System.out.println(yes);
	return 'k';
}

}
