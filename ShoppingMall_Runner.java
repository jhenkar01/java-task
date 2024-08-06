 public class ShoppingMall_Runner{
	public static void main (String[]args){
	ShoppingMall mall = new ShoppingMall();
	int nameLength = mall.getMallArrayLength();
	System.out.println("The array length is:"+nameLength);
	String mallName=mall.saveAnMallnames("Max");
	mall.saveAnMallnames("Trends");
	mall.saveAnMallnames("Adidas");
	mall.saveAnMallnames("Nyka");
	mall.saveAnMallnames("Nike");
	mall.readAnMallNames();
	System.out.println("-----update operation------");
	String updateResult = mall.updateAnMallNames("Trends","Puma");
	
	System.out.println("The updated result:"+updateResult);
	mall.readAnMallNames();
	System.out.println("-----delete operation------");
	String deletResult= mall.deleteAnMallNames("Max");
	mall.readAnMallNames();
	System.out.println("-----search operation------");
	String searchResult = 	mall.searchAnMallNames("Nike");
	
	
	}
	
}
