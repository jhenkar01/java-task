public class CartoonRunner{

public static void main(String args[]){


Cartoon cartoon  = new Cartoon();

String name[] = {"tom and jerry","ben 10","poppy","roll no 23"};

cartoon.setString(name);
System.out.println(cartoon.getString());

int no[] = {1,2,3,5,7};
cartoon.setint(no);
System.out.println(cartoon.getint());

boolean yes[] = {true,false,true};
cartoon.setboolean(yes);
System.out.println(cartoon.getboolean());

float value[] = {12.3f,45.8f};
cartoon.setfloat(value);
System.out.println(cartoon.getfloat());
}
}