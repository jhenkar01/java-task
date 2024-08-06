//declare a class to achieve static method overloading and chaining


public class Enter{

public static int price;
public static String name;
public static float amount;
public static byte no;
public static String names[];



public static void bag(){

System.out.println("hii");
Enter.pencil(1000);

}
public static void pencil(int price){

System.out.println(price);
}

public static int scale(){

return 01;
}

public static int rubber(byte no){
	
	
	System.out.println(no);
	return 7;
}
public static String sharpner(String names[]){
	
	for(int i=0;i<names.length;i++){
		
		System.out.println(names[i]);
	}
	return "ii";
}

}