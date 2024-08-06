//Write a program to store the Alphabets and the developer needs to perform the Create and Read Operation.

public class Alphaa{
 
 char letter[]  =  new char[4];
 public int index = 0;
 
 public int getshoplength(){
	 
	 return letter.length;
 }
 
 public void getnames( char elememts){
	 
	 if(this.index<this.getshoplength()){
		 
		 System.out.println("not full");
		 letter[index] = elememts;
		 index++;
	 }else{
		 
		 System.out.println("full");
	 }
	 
 }
 public String read(){
		for(int index=0;index<this.getshoplength();index++){
			System.out.println(letter[index]);
		}
		return"Found";
 
 }}