public class CheckZeroOnces{

public static void main(String args[]){

 int no[] = {0,1,0,0,1,0,1,0,1};
 int onescount = 0;
 int zeroscount = 0;
 
 for(int i = 0;i<no.length;i++){
	 
	 if(no[i] == 0){
		 
		 
		 System.out.println("0 s:"+no[i]);
		 zeroscount++;
	 }
	 
	 
  else{
	 
	 
	System.out.println("1 s:"+no[i]);
	onescount++;
 }

 }

System.out.println("no of zeros:"+zeroscount);
System.out.println("no of onces:"+onescount);


}

}