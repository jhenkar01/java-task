 //Write a program to store the shop names and the developer needs to Perform the Create and Read operation.
 
 public class Night{
 
 String shop[]  =  new String[4];
 public int index = 0;
 
 public int getshoplength(){
	 
	 return shop.length;
 }
 
 public void getnames(String elememts){
	 
	 if(this.index<this.getshoplength()){
		 
		 System.out.println("not full");
		 shop[index] = elememts;
		 index++;
	 }else{
		 
		 System.out.println("full");
	 }
	 
 }
 public String read(){
		for(int index=0;index<this.getshoplength();index++){
			System.out.println(shop[index]);
		}
		return"Found";
 
 }}