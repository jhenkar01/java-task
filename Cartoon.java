/*3. Create class with 4 properties(properties should taken has array type)
and make it private and assign values and display it.*/

public class Cartoon{

private String name[];
private int no[];
private boolean yes[];
private float value[];

public Cartoon(){
	
	System.out.println("cartoon");
}

public void setString(String name[]){
	
	this.name = name;
		for(int i=0;i<name.length;i++){
		
		System.out.println(name[i]);
	}

}

public String getString(){
	
	return "1st";
	
}
public void setint(int no[]){
	
	this.no = no;
	for(int i=0;i<no.length;i++){
		
		System.out.println(no[i]);
	}
}
public int getint(){
	
	return 8;
}
public void setboolean(boolean yes[]){
	
	this.yes = yes;
	for(int i=0;i<yes.length;i++){
		
		System.out.println(yes[i]);
	}
}
public boolean getboolean(){
	
	return true;
}

public void setfloat(float value[]){
	
	this.value =value;
	for(int i=0;i<value.length;i++){
		
		System.out.println(value[i]);
	}
}
public float getfloat(){
	
	return 14.8f;
}
}