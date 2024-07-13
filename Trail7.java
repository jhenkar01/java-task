public class Trail7{

public static void main(String args[]){


long number = 9876543210L;
 long reverse = 0;

	for (long rem = number%10;rem<=number;rem++)
		{
		//long rem = number % 10;
		reverse = reverse * 10 + rem;
		System.out.println("reverse:"+reverse+ " "+"rem"+rem);
		number = number /10;	
	}

	}



}