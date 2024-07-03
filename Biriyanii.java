/*Biriyani->
1. write a method to display the ingredients and accept the ingredients
2. write a method to accept and display the review.
if the review is 10 then display "Wow"
if review is <10 and >5 display "good"
if the review is <5 display "worst"
3. Write a method to calculate the Biriyani total price
accept quality and price in methods*/

public class Biriyanii{

public static void ingredients(String rice,String powders,String vegetables,String amntofchicken,
String waterquant){

System.out.println("rice type:"+rice);
System.out.println("powders use:"+powders);
System.out.println("vegetables required:"+vegetables);
System.out.println("amount of chiken:"+amntofchicken);
System.out.println("water required:"+waterquant);

}
 public static void review(int reviewrate){
	 
	 
	 if(reviewrate==10)
	 {
		 
		 System.out.println("wow");
	 }
     if( reviewrate>5 && reviewrate<10)
	 {
		 
		 System.out.println("good");
		 
	 }
	 if(reviewrate <5)
	 {
		 
		 System.out.println("worust");
	 }


}
  public static void qualityprice(String quality,double price){
	  
	  
	  double gst = 0.18;
	  double totalcost = gst+price;
	  System.out.println("quality is:"+quality);
	  System.out.println("total price is:"+totalcost);
  }
}