public class Student{

String name;
int grade[];
float avg = 0;


public Student(){
	
	
	System.out.println("student grades");
}

public Student(String name){
	
	this.name= name;
	System.out.println("student name is:"+name);
	
	
}

public Student(int grade[]){
	
	this.grade = grade;
	for(int index = 0;index<grade.length;index++){
		System.out.println(grade[index]);
	this.avg = avg + grade[index];
		
	}
	double avrage = avg/grade.length;
	System.out.println("avrage marks is:"+avrage);
	
}
public int highestScore(int grade[]){
	int max = grade[0];
	for(int i=0;i<grade.length;i++){
		
		if(grade[i]>max){
			max = grade[i]; 
			
		}
	}
	System.out.println("highest is:"+max);
	return 0;
}
public int lowestscore(int grade[]){
	
	int min = grade[0];
	for(int i=0;i<grade.length;i++){
		
		if(grade[i]<min){
			
			min = grade[i];
		}
	}
	System.out.println("lowestscore is:"+min);
	return 0;
}
}