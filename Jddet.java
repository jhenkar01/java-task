public class Jddet{

public String name;
public String role;
public int sal;
public short date;
public String loc[];
public float succes;
public double fail;
public boolean yes;
public byte dis;
public long turnover;


public Jddet(){
	
	System.out.println("require");
	
	
}
public Jddet(String name){
	
	this.name = name;
	System.out.println(name);
	
	
	
}
public Jddet(String name,String role){
	
	this.name = name;
	this.role = role;
	System.out.println("name is:"+name);
	System.out.println(role);
	
}
public Jddet(String name,String role,int sal){
	
	this.name = name;
	this.role = role;
	this.sal = sal;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);

}


public Jddet(String name,String role,int sal,short date){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
}
public Jddet(String name,String role,int sal,short date,String loc[]){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	this.date = date;
	this.loc = loc;
	
	
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
	this.loc = loc;
	for(int i=0;i<loc.length;i++)
	{
		
		System.out.println(loc[i]);
	}
}
public Jddet(String name,String role,int sal,short date,float succes,boolean yes){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	this.succes = succes;
	this.yes = yes;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
	System.out.println(succes);
	System.out.println(yes);
}
public Jddet(String name,String role,int sal,short date,float succes,boolean yes,long turnover){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	this.succes = succes;
	this.yes = yes;
	
	this.turnover = turnover;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
	System.out.println(succes);
	System.out.println(yes);
	System.out.println(turnover);
	
}
public Jddet(String name,String role,int sal,short date,float succes,boolean yes,long turnover,byte dis){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	this.succes = succes;
	this.yes = yes;
	this.turnover = turnover;
	this.dis = dis;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
	System.out.println(succes);
	System.out.println(yes);
	System.out.println(turnover);
	System.out.println(dis);
}
public Jddet(String name,String role,int sal,short date,float succes,boolean yes,long turnover,byte dis,String loc[]){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	this.succes = succes;
	this.yes = yes;
	this.turnover = turnover;
	this.dis = dis;
	this.loc = loc;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
	System.out.println(succes);
	System.out.println(yes);
	System.out.println(turnover);
	System.out.println(dis);
	for(int i=0;i<loc.length;i++){
		
		
		System.out.println(loc[i]);
	}
	
}
public Jddet(String name,String role,int sal,short date,float succes,boolean yes,long turnover,byte dis,String loc[],int det[]){
	
	this.name = name;
	this.role = role;
	this.date = date;
	this.sal = sal;
	this.succes = succes;
	this.yes = yes;
	this.turnover = turnover;
	this.dis = dis;
	this.loc = loc;
	//this.det  = det;
	System.out.println(name);
	System.out.println(role);
	System.out.println(sal);
    System.out.println(date);
	System.out.println(succes);
	System.out.println(yes);
	System.out.println(turnover);
	System.out.println(dis);
	for(int i=0;i<loc.length;i++){
		
		
		System.out.println(loc[i]);
	}
	for(int i=0;i<det.length;i++){
		
		System.out.println(det[i]);
	}
}
}