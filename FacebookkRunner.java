public class FacebookkRunner{

public static void main(String args[]){

Facebookk face  = new Facebookk();
Facebookk face1 = new Facebookk("siddu",100,200);



Facebookk face2  = new Facebookk();
face2.setString("sidd");
System.out.println(face2.getString());

face2.setint(500);
System.out.println(face2.getint());


face2.setintt(700);
System.out.println(face2.getintt());

if(face2.getint() >50&& face2.getint() <100){
	
	System.out.println("name is:"+face2.getString());
}
else{
	
	System.out.println("no");
}

if(face2.getString() == "siddu"){
	
	System.out.println("usename");
}
else{
	
	System.out.println("invalid");
}
}

}
