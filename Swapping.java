public class Swapping{
public static void swap(int y){
int x=100;
int temp;
temp=x;
x=y;
y=temp;
System.out.println("x value is"+x);
System.out.println("y value is"+y);


}
public static void swapstring(String yellow){
String x = "red";
 String temp;
temp=x;
x=yellow;
yellow=temp;
System.out.println("x value is"+x);
System.out.println("y value is"+yellow);

}
public static void lcm(int b){
	
	int a = 15;
	int ans = (a>b)? a:b;
	while(true){
		
		if(ans%a==0 && ans%b==0)
			break;
		ans++;
		System.out.println("lcm of " + a +" and " + b +":"+ans);
	}
	
}
public static void lcmno(int b){
	
	int a = 25;
	int ans = (a<b)? a:b;
	while(true){
		
		if(ans%a==0 && ans%b==0)
			break;
		ans++;
		System.out.println("lcm of " + a +" and " + b +":"+ans);
	}
	
	
}
public static void swapr(int y){
int x=200;
int temp;
temp=x;
x=y;
y=temp;
System.out.println("x value is"+x);
System.out.println("y value is"+y);


}
}
