public class Boat{

public Boat(){



System.out.println("task complete");

}

public int price;
public String name;
public short distance;
public float failure;
public String boats[];


public Boat(int price,String name,short distance,float failure,String boats[]){
	
	this.price = price;
	this.name = name;
	this.distance = distance;
	this.failure = failure;
	this.boats = boats;
	
	
	
	System.out.println(price);
	System.out.println(name);
	System.out.println(distance);
	System.out.println(failure);
	
	for(int i=0;i<boats.length;i++){
		
		
		System.out.println(boats[i]);
	}
	
	
	
	
	
	
	
}










}