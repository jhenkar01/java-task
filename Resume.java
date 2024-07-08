public class Resume{

public static void application(){
String application = "Infosys";
System.out.println("Application for the job:"+application);
}
public static void application(String application,String name){
System.out.println("Application for the job:"+application+"::"+"name is"+"::"+name);

}
public static String application(int age){
String qualification = "B.E";
System.out.println("Qualification is:"+qualification+"Age"+"::"+age);
return "end";
}
public static void application(String skills[]){
for(int index=0;index<skills.length;index++){
System.out.println("Required Skills are:"+skills[index]);
}
}
}