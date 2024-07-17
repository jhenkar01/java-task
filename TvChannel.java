public class TvChannel{

public String name;
public int year;
public short ratings;
public String topic;
public String chnames[];




public TvChannel(){
	
	
	System.out.println("tv channel details");
	
}

public TvChannel(String name,int year,short ratings,String topic,String chnames[]){
	
	this.name = name;
	this.year = year;
	this.ratings = ratings;
	this.topic = topic;
	this.chnames = chnames;

System.out.println("name:"+name);
System.out.println("year:"+year);
System.out.println("ratings:"+ratings);
System.out.println("topic:"+topic);
System.out.println("chnames:"+chnames);



for(int index = 0;index<chnames.length;index++){
	
	System.out.println(chnames[index]);
}

}
}