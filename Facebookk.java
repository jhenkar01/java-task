public class Facebookk{
	
	private String username;
	private int noOfLikes;
	private int noOfFriends;
	
	
	public Facebookk(){
		
		
		System.out.println("facebook details");
	}
	
	public Facebookk(String username,int noOfLikes,int noOfFriends){
		
		this.username = username;
		this.noOfLikes = noOfLikes;
		this.noOfFriends = noOfFriends;
		
		System.out.println(username);
		System.out.println(noOfLikes);
		System.out.println(noOfFriends);
	}
	
	
	public void setString(String username){
		
		
		this.username = username;
	}
	public String getString(){
		
		return this.username;
	}
	public void setint(int noOfLikes){
		
		this.noOfLikes = noOfLikes;
	}
	public int getint(){
		
		return this.noOfLikes;
	}
	
	public void setintt(int noOfFriends){
		
		this.noOfFriends = noOfFriends;
	}
	public int getintt(){
		
		return this.noOfFriends;
	}
}