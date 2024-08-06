public class ShoppingMall{
	int index=0;
	String mallNames[]=new String[5];
	
	
	public int getMallArrayLength(){
		return mallNames.length;
		
	}
	
	public String saveAnMallNames(String element){
		if(this.index<this.getMallArrayLength()){
		mallNames[index]=element;
		index++;
		
		}
		else{
		System.out.println("The array length is full");
	
	}
	return"the element is sucessfully inserted";
	}
	
	public void readAnMallNames(){
		for (int index=0;index<this.getMallArrayLength();index++){
		System.out.println("The Mall Names are:"+mallNames[index]);
		}
	}
	
	public String updateAnMallNames(String oldElement,String newElement){
		for (int index=0;index<this.getMallArrayLength();index++){
			if(mallNames[index]==oldElement){
				mallNames[index]=newElement;
			
			return"The element is updated";
			}
					
		
		}return "The element is not updated ";
	}

	public String deleteAnMallNames(String element){
		for (int index=0;index<this.getMallArrayLength();index++){
			if(mallNames[index]==element){
				mallNames[index]=null;
				
		return"The element is deleted";
	}
		}return "The element is not updated ";
}

	public String searchAnMallNames(String element){
	for(String name:mallNames){
		if(name==element){
			System.out.println(""+element);
		
			return "the element is found";
		}
	}return "the element is not found";
	
	}	
}