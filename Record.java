//2. declare a class to achieve constructor overloading and chaining

public class Record{

    int price;
	String name;
	float amount;
	byte no[];
	boolean yes;

public Record(){

System.out.println("2nd program");

}

public Record(int price){
	this(100,"bio");
	this.price = price;
	System.out.println(price);
	
}

public Record(int price,String name){
	
	this.price = price;
	this.name = name;
	System.out.println(price);
	System.out.println(name);

}
public Record(int price,String name,byte no[]){
	
	this.price = price;
	this.name = name;
	this.no = no;
	System.out.println(price);
	System.out.println(name);
	for(int i=0;i<no.length;i++){
	System.out.println(no[i]);
	}
	
}}