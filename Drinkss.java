/*2. in each class developer needs to declare 4 methods with arguments,in each
method add 3 if statements
Drinks
Water
Air
Rain
Cloth*/

public class Drinkss{

public static void drink(String name,int price){

String drinkname = "pepsi";
if(drinkname==name){
   
   System.out.println("drink");


}if(price ==30){

System.out.println("actual price");
  

}else{

System.out.println("no");

}

}
public static void drinks(String contains,int percent){
	  String contain = "calories";
	if(contain == contains){
		
		
		System.out.println("yes");
	}if (percent == 5){
		
		System.out.println("good");
		
	}if(percent<6){
		
		System.out.println("good to health");
	}
	
	
}
public static void drinkcmpny(String cmpny,int profit,int loss){
	  String coke = "nameofcmny";
	if(profit>loss){
		
		
		System.out.println("profit");
	}if (loss>profit){
		
		System.out.println("loss");
		
	}if(cmpny == coke){
		
		System.out.println("yes");
	}
	
	
}
public static void drnk(int est,int exp,int amnt){
	  
	if(est<exp){
		
		
		System.out.println("good");
	}if (exp<est){
		
		System.out.println("not good");
		
	}if(amnt == est){
		
		System.out.println("drink");
	}
	
	
}




}