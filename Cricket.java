/*Cricket->
1. Write a method to calculate the Runrate of the player
method should accept, player name, total score
2. Write a method to display the match result
3. Write a method to accept 11 players methods and display it
4. Write a method to accept player details and display it.
name, age, height, weight, eductaion,number of matches, total score*/

public class Cricket{

public static void cricketmatch(String name,int runscore){
 int oversfaced = 18;
 int runrate = runscore/oversfaced;
 System.out.println("name of the cricketer:"+name);
 System.out.println("total score:"+runscore);
 System.out.println("run rate is:"+runrate);
}
public static void cricketresult(boolean result){
	
	System.out.println("the match result is won?:"+result);
}
public static void cricketplayers(int noofplayers){
	
	System.out.println("no of player are:"+noofplayers);
	
}
public static void playersdetails(String name,int age,float height,float weight,String eductaion,
int numberofmatches,int totalscore){
	
	
	System.out.println("name of player:"+name);
	System.out.println("age of player:"+age);
	System.out.println("height of player:"+height);
	System.out.println("weight of player:"+weight);
	System.out.println("eductaion of player:"+eductaion);
	System.out.println("no of matches:"+numberofmatches);
	System.out.println("total score:"+totalscore);
	
}



}
