

//reverse no

public class Trail6{

public static void main(String args[]){


long number = 720454678770L;
 long reverse = 0;

while (number!= 0){
	
	long rem = number % 10;
    reverse = reverse * 10 + rem;
	System.out.println("reverse:"+reverse+ " "+"rem"+rem);
	number = number /10;
	
	
}

}



}