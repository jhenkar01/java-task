public class Employee{

String name;
int sal[];
float avg = 0;


public Employee(){
	
	
	System.out.println("employee deatils");
}

public Employee(String name){
	
	this.name= name;
	System.out.println("employee name is:"+name);
	
	
}

public Employee(int sal[]){
	
	this.sal = sal;
	for(int index = 0;index<sal.length;index++){
		System.out.println(sal[index]);
	this.avg = avg + sal[index];
		
	}
	double avrage = avg/sal.length;
	System.out.println("avrage sal is:"+avrage);
	
}
public int highestSal(int sal[]){
	int max = sal[0];
	for(int i=0;i<sal.length;i++){
		
		if(sal[i]>max){
			max = sal[i]; 
			
		}
	}
	System.out.println("highest is:"+max);
	return 0;
}
public int lowestsal(int sal[]){
	
	int min = sal[0];
	for(int i=0;i<sal.length;i++){
		
		if(sal[i]<min){
			
			min = sal[i];
		}
	}
	System.out.println("lowestsal is:"+min);
	return 0;
}
}