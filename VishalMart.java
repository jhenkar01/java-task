
/* Create a class with 4 properties and make it private,
assign values and display it.*/


public class VishalMart{
	
	private String product;
	private int price;
	private byte quantity;
	private boolean yes;
	
	
	
	public VishalMart(){
		
		
		System.out.println("private properties");
	}
	
	
	public void setString(String product){
		
		this.product = product;
	}
	
	public String getString(){
		
		return product;
	}
	
	public void setint(int price){
		
		this.price = price;
	}
	
	public int getint(){
		
		return price;
	}
	
	public void setbyte(byte quantity){
		
		this.quantity = quantity;
	}
	public byte getbyte(){
		
		return quantity;
	}
	public void setboolean(boolean yes){
		
		this.yes = yes;
	}
	public boolean getboolean(){
		
		return yes;
	}
}
