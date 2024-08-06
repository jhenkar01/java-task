public class ClothBrandsRunner{
	public static void main(String args[]){
		
	ClothBrands brand=new ClothBrands();
	int length=brand.getBrandslength();
	System.out.println(length);
	brand.collection("Puma");
	brand.collection("Clock");
	brand.collection("kanchi");
	brand.collection("Puma");
	brand.read();
	}


}