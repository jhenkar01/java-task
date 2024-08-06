public class FruitsthingRunner{
	public static void main(String args[]){
		Fruitsthing fruits = new Fruitsthing();
		int aboutFruits = fruits.aboutFruits();
	System.out.println("the array length is:"+aboutFruits);
     fruits.fruitsinformation("mango");
	      fruits.fruitsinformation("apple");
		  fruits.fruitsDetails();
		  System.out.println("------------updateFruits---------");
		  String updatefruits=fruits.updateFruits("orange","mango");
		  System.out.println("updated fruit:"+updatefruits);
		  fruits.fruitsDetails();
		  System.out.println("------------deletedFruits---------");
		  String deletefruits=fruits.deleteFruits("apple");
		  System.out.println("deleted fruit:"+deletefruits);
	  	 fruits.fruitsDetails();
		 System.out.println("------------searchedFruits---------");
         String searchfruits=fruits.searchFruits("orange");
 		 System.out.println("searching:"+searchfruits);
	  	 fruits.fruitsDetails();  
}
}