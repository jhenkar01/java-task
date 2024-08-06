//Write a program to store the prices and the developer needs to Perform the Create and Read operation

 
 public class Store{
 
 int price[]  =  new int[4];
 public int index = 0;
 
 public int getshoplength(){
	 
	 return price.length;
 }
 
 public void getnames(int elememts){
	 
	 if(this.index<this.getshoplength()){
		 
		 System.out.println("not full");
		 price[index] = elememts;
		 index++;
	 }else{
		 
		 System.out.println("full");
	 }
	 
 }
 public String read(){
		for(int index=0;index<this.getshoplength();index++){
			System.out.println(price[index]);
		}
		return"Found";
 
 }}