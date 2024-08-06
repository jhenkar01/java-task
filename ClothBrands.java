public class ClothBrands{
	
	String brand[]=new String[4];
	public int index=0;
	
	public int getBrandslength(){
		return brand.length;
	}
	public void collection(String element){
		if(this.index<this.getBrandslength()){
			System.out.println("Not Full");
			
			brand[index]=element;
			index++;
			
		}else{
			System.out.println("Full");
		}
	}
	public String read(){
		for(int index=0;index<this.getBrandslength();index++){
			System.out.println(brand[index]);
		}
		return"Found";
	}
	





}