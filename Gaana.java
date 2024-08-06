public class Gaana{

	String songName[] = new String[4];
	public int index =0;
	
	public int getlength(){
		return songName.length;
	}
	
	public String createbySongname(String element){
		if(this.index<this.getlength()){
			songName[index]=element;
			index++;
		}return	"Cannot update Array";
	}
	public void songreadby(){
		for(int index=0;index<this.getlength();index++){
			System.out.println(songName[index]);
		}
		
	}
	public String songupdateby(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(songName[index]==oldname){
				songName[index]=newname;
				System.out.println("Song Are :"+newname);
				return "updated successfully";
			}
			}return"updatefail";
		}
		public String songdeleteby(String name){
		for(int index=0;index<this.getlength();index++){
			if(songName[index]==name){
				 songName[index]=null;
			System.out.println("Song are :"+songName[index]);
			return"delete sucessfully";
			}
			
			}
			return"delete not sucess";	
		}
		public String searchBySongNames (String names){
			for(String name :songName ){
			if(names == name){
			return "Found :"+names;
			}
		}
		return "Search result not found";
	}  


}