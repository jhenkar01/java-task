public class Rcb{

public Rcb(){




System.out.println("won");



}

public int price;
public String name;
public short day;
public float rcb;
public int arr[];

public Rcb(int price,String name,short day,float rcb,int arr[]){
	
	System.out.println(price);
	System.out.println(name);
	System.out.println(day);
	System.out.println(rcb);
	System.out.println(arr);
	
	for(int i=0;i<arr.length;i++){
		
		
		System.out.println(arr[i]);
	}
	
	this.price = price;
	this.name = name;
	this.day = day;
	this.rcb = rcb;
	this.arr = arr;
	
	
	
	
}





}