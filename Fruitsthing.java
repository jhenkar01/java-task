public class Fruitsthing{
	
	String fruitsName[]=new String[2];
	int index=0;
	
	public int aboutFruits(){
		return fruitsName.length;
	}
	public String fruitsinformation(String name){
			if(this.index<this.aboutFruits()){
				fruitsName[index]=name;
				index++;
				}else{
				System.out.println("array length is full");
			}return "successfully inserted";
	}
public void fruitsDetails(){
	for(int index=0;index<this.aboutFruits();index++){
		System.out.println("Available fruits are:"+this.fruitsName[index]);
	}
}
public String updateFruits(String newFruit,String oldFruit){
	for(int index=0;index<this.aboutFruits();index++){
	if(fruitsName[index]==oldFruit){
			fruitsName[index]=newFruit;
			return "updated successfully";
	}
		
	}return"not updated";
	
}
public String deleteFruits(String name){
		for(int index=0;index<this.aboutFruits();index++){
	if(fruitsName[index]==name){
			fruitsName[index]=null;	
         return "deleted successfully";
}
		}return "not deleted";
		
}
public String searchFruits(String nameOfFruit){
	for(String names:fruitsName){
		if(names==nameOfFruit){
		System.out.println(""+nameOfFruit);
          return "search successfully";
	}
			}return"names are not found";
}


		
}