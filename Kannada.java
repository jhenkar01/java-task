
//method chaining:


public class Kannada{

public String lung;
public int year;
public String aim;
public int num;
public boolean yes;
public boolean no;

public Kannada(){
	
	System.out.println("kannada");
	
	
}
public Kannada(String lung){
	
	this("kalki",2002);
	System.out.println(lung);
	this.lung = lung;
	
}
public Kannada(String lung,int year){
	
	System.out.println(lung);
	System.out.println(year);
	
	this.lung = lung;
	this.year = year;
}

public Kannada(String lung,int year,String aim){
	
	System.out.println(lung);
	System.out.println(year);
	System.out.println(aim);
	
	this.lung = lung;
	this.year = year;
	this.aim = aim;
}
public Kannada(String lung,int year,String aim,int num){
	
	System.out.println(lung);
	System.out.println(year);
	System.out.println(aim);
	System.out.println(num);
	
	this.lung = lung;
	this.year = year;
	this.aim = aim;
	this.num = num;
}

//instance 
{
	
	System.out.println("instance method");
}
static
{


     System.out.println("static method");
}

}