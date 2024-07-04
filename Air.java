//Air
public class Air{
 public static void air(int presure,String contain){
 String co2 = "carbon dioxide";
 String o2 = "oxygen";
 if(presure >100){
	 
	 System.out.println("more pressure");
 }if(contain == "co2"){
	 
	 System.out.println("not good air");
 }if(contain == "o2"){
	 
	 System.out.println("good air");
 }
 
 
 
 }
 public static void aircond(int speed,String cond){
 String oxy = "speed";
 if(speed >100){
	 
	 System.out.println("more speed");
 }if(cond =="oxy"){
	 
	 System.out.println("speed");
 }if(cond != "oxy"){
	 
	 System.out.println("low");
 }
 
 
 
 }
 public static void airr(boolean air ,int level){
 boolean airrr = true;
 if(airrr){
	 
	 System.out.println("yes");
 }if(level>100){
	 
	 System.out.println("high");
 }if(level<100){
	 
	 System.out.println("low");
 }
 
 
 
 }


}