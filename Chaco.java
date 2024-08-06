/* Create a class with 3 properties and declare a 4 ways of
methods and achieve method overloading and chaining of instance methods */

public class Chaco{


public int price;
public String name;
public float rate;


public Chaco(){
	this (500);
	System.out.println("chacos");
}

public Chaco(int price){
	
	this.price = price;
	System.out.println(price);
}
public Chaco(String name,int price){
	
	this.name = name;
	this.price = price;
	System.out.println(price);
	System.out.println(name);
}

//4 ways of instance method

public void kitkat(){
	
	System.out.println("fav");
}
public void dairymilk(int price){
	
	
	System.out.println(price);
}

public int milkybar(){
	
	return 12;
}

public int kissme(String name){
	
	System.out.println(name);
	return 100;
}
}