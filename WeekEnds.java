public class WeekEnds{


public static void main(String args[]){

String  days[] = {"sun","mon","tue","wed","thu","fri","sat"};

String weekend1 = "sat";
String weekend2 = "sun";

for(int i=0;i<days.length;i++){
	
	if(days[i] == weekend1 || days[i] == weekend2){
		
		System.out.println(days[i]);
		System.out.println("sat is weekend");
		System.out.println("sun is weekend");
		
		
	}
	else{
		
		
		System.out.println(days[i]);
			
			System.out.println("week days");
		}
	}
	
	


 
}



}