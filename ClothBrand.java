public class ClothBrand{

int index = 0;
String brandName[] = new String[5];

public int getlength(){
	
return brandName.length;

}
public String clothss( String elements){
	
	if(this.index<this.getlength())
	{
		brandName[index] = elements;
		System.out.println("not full");
		
		
	}else{
		
		System.out.println("full");
	}
	return "hi";
}
}
