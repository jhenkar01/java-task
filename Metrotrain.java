/*Metro ->
1. Write a method to accept the from and to and display it.
if from Bhanashankari and to is BTM then display the ticket price is 25rs
else display the 50rs.
2. Write a method to check the card balance
accept the card balance, and ticket price then display the card balance*/

public class Metrotrain{

public static void fromto(String from,String to){

if(from == "bhanashankari"){
	
	if(to == "btm"){

    System.out.println("ticket price is 25rs");

}
}
else{

    System.out.println("ticket price is 50rs");


}


}
public static void balance(int balance,int ticketprice ){
	System.out.println("balance is:"+balance);
	System.out.println("ticket price is:"+ticketprice);
	
	
	
	
	
}



}