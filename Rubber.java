public class Rubber{

public Rubber(){




System.out.println("erazer");



}

public int price;
public String name;
public short day;
public float erace;
public int arr[];

public Rubber(int price,String name,short day,float erace,int arr[]){
	
	System.out.println(price);
	System.out.println(name);
	System.out.println(day);
	System.out.println(erace);
	System.out.println(arr);
	
	for(int i=0;i<arr.length;i++){
		
		
		System.out.println(arr[i]);
	}
	
	this.price = price;
	this. name = name;
	this. day = day;
	this. erace = erace;
	this. arr = arr;
	
	
	
	
}





}