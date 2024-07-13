// count of even and odd

public class Nogenarate1{

public static void main(String args[]){
int evencount=0;
int oddcount=0;

for(int i=1;i<=50;i++){
if(i%2==0){
	
	System.out.println(i);
	System.out.println("even");
	evencount +=1;
	System.out.println(evencount);
	
}else{
	
	
	System.out.println(i);
	System.out.println("odd");
	oddcount +=1;
	System.out.println(oddcount);
}
	
}
}
}