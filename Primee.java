public class Primee{

public static void main(String args[]){
	int count = 0;
	int num = 15;
	if(num < 2){

		System.out.println("not a prime no");

	}
  for( int i =2 ;i<=num;i++){

	  if(num%i == 0){

		  count ++ ;
	  }

	  }

	  if(count<2){

		  System.out.println("prime no:"+num);
	  }else{

		  System.out.println("not a prime:"+num);
	  }

}}