public class Photo{

public static void shoot(){

System.out.println("photo frame");

}
public static void shoot(String name,int no){
	
	System.out.println(name);
	System.out.println(no);
	
	
	
}
public static String shoot(int coin,String note){
	
	System.out.println(note);
	System.out.println(coin);
	
	return "complete";
}
public static boolean shoot(String charge[]){
	
	for(int i=0;i<charge.length;i++){
		
		System.out.println(charge[i]);
	}
	return true;
}




}