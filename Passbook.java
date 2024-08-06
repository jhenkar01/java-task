public class Passbook{
	
	private String holderName;
	private int accno;
	private String address;
	private float balance;
	private boolean yes;
	
	
	public void setholdername(String holderName){
		
		this.holderName  = holderName;
	}
	
	public String getholdername(){
		
		return holderName;
	}
	
	public void setaccno(int accno){
		
		this.accno = accno;
	}
	public int getaccno(){
		
		return accno;
	}
	
	public void setaddres(String address){
		
		this.address = address;
	}
	public String getaddres(){
		
		return address;
	}
	public void setbalance(float balance){
		
		this.balance = balance;
	}
	public float getbalance(){
		
		return balance;
	}
	
	public void setyes(boolean yes){
		
		this.yes = yes;
	}
	public boolean getyes(){
		
		return yes;
	}
}