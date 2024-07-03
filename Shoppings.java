/* Shopping ->
1. write a method to accept the ShoppingType and display the shopping type
2. Write a method to display the totalPrice including GST
and accept the price and GST.
3. write a method to accept the shopped ItemName and Shopping type and display it.
4. Write a method to display all the shopping details and accept Shoppingtype,
item name, totalPrice.*/
 public class Shoppings{
	 
  //public static void final double gst = 0.18;
  
 public static void shoppingType(String shoes){
 
  System.out.println("shopping type is:"+shoes);
 
 
 }
 public static void shoppingtype(double totalPrice,double gst){
	 
	 double expenditure = totalPrice+(totalPrice*gst);
	 System.out.println("totalPrice is:"+totalPrice);
	 System.out.println("gst is:"+gst);
	 System.out.println("expenditure is:"+expenditure);
	  
	 
	 
 }
 
 public static void shopping(String itemname,String shoppingtype){
	 
	 System.out.println("the item name is:"+itemname);
	 System.out.println("the shopping type is:"+shoppingtype);
	 
	 
 }
 public static void shoppingcomplete(String shopdetails,String shoptype,int totalPrice){
	 
	System.out.println("shoping details:"+shopdetails);
	System.out.println("shoping type:"+shoptype);
	System.out.println("shoping totalPrice:"+totalPrice);
	
	 
	 
 }
 
 }
 
 
 
 