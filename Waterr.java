//Water
public class Waterr{

public static void water(String name,int price){

String cmpkname = "bisleri";
if(cmpkname==name){
   
   System.out.println("yes");


}if(price ==20){

System.out.println("actual price");
  

}if(price>100){

System.out.println("maybe");

}

}
public static void waterdrnk(String contains,int percent){
	  String contain = "minirals";
	if(contain == contains){
		
		
		System.out.println("yes");
	}if (percent == 5){
		
		System.out.println("good");
		
	}if(percent<6){
		
		System.out.println("good to health");
	}
	
	
}
public static void watercmpny(String cmpny,int profit,int loss){
	  String water = "nameofcmny";
	if(profit>loss){
		
		
		System.out.println("profit");
	}if (loss>profit){
		
		System.out.println("loss");
		
	}if(water == "bisleri"){
		
		System.out.println("yes");
	}
	
	
}
public static void waterest(int est,int exp,int amnt){
	  
	if(est<exp){
		
		
		System.out.println("good");
	}if (exp<est){
		
		System.out.println("not good");
		
	}if(amnt == est){
		
		System.out.println("drink");
	}
	
	
}




}