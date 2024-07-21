public class Chiily{

public int price;
public String name;
public String addres[];
public String spice;
public float rate;
public byte rating;



public Chiily(){
	
	this(150);
	
	System.out.println("pizza hut");
	
}

public Chiily(int price){
	
	this(300,"chatpat");
	System.out.println(price);
	this.price = price;
	
}
public Chiily(int price,String name){
	
	this(100,"mng","masala",450);
	System.out.println(price);
	System.out.println(name);
	this.price = price;
	this.name = name;
}
public Chiily(int price,String name,String addres[]){
	
	System.out.println(price);
	System.out.println(name);
	for(int i=0;i<addres.length;i++){
		
		System.out.println(addres[i]);
	}
	this.price = price;
	this.name =  name;
	this.addres = addres;
}
public Chiily(int price,String name,String spice,float rate){
	
	System.out.println(price);
	System.out.println(name);
	System.out.println(spice);
	System.out.println(rate);
	this.price = price;
	this.name = name;
	this.spice = spice;
	this.rate = rate;
	
	
}
public Chiily(int price,String name,String spice,float rate,byte rating){
	
	System.out.println(price);
	System.out.println(name);
	System.out.println(spice);
	System.out.println(rate);
	System.out.println(rating);
	this.price = price;
	this.name = name;
	this.spice = spice;
	this.rate = rate;
	this.rating = rating;
}}