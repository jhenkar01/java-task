// declare a class to achieve instance method overloading and chaining.

public class Narrow{


public void prg1(){

this("oyy");
System.out.println("yes");

}

public void prg2(String name){
	
	
	System.out.println(name);
}

public String prg4(int no,String cmp){
	
	
	System.out.println(no);
	System.out.println(cmp);
	return "done";
	
}


public int prg3(int price){
	
	
	System.out.println(price);
	return 9;
}
}