public class Scale{


public int price;
public String cmpny;
public short no;
public float lenth;
public int arr[];





public Scale(){

System.out.println("instance");


}





public Scale(int price,String cmpny,short no,float lenth,int arr[]){
	
	this.price = price;
	this.cmpny = cmpny;
	this.no = no;
	this.lenth = lenth;
	this.arr = arr;
	
	System.out.println(price);
	System.out.println(cmpny);
	System.out.println(no);
	System.out.println(lenth);
	for(int i = 0;i<arr.length;i++){
		
		System.out.println(arr[i]);
		
		
	}
	
	
	
	
}



}