/*3. for 3 classes declare 6 instances and achieve
constructor chaining with 5 constructor*/


//method chaining:


public class Karunadu{

public String lung;
public int year;
public String aim;
public int num;
public boolean yes;
public boolean no;

public Karunadu(){
	
	System.out.println("kannada");
	
	
}
public Karunadu(String lung){
	
	this("kalki",2002);
	System.out.println(lung);
	this.lung = lung;
	
}
public Karunadu(String lung,int year){
	
	System.out.println(lung);
	System.out.println(year);
	
	this.lung = lung;
	this.year = year;
}

public Karunadu(String lung,int year,String aim){
	
	System.out.println(lung);
	System.out.println(year);
	System.out.println(aim);
	
	this.lung = lung;
	this.year = year;
	this.aim = aim;
}
public Karunadu(String lung,int year,String aim,int num){
	
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


