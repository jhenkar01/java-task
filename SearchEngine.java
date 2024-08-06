public class SearchEngine{

String search[] = new String[4];
int index = 0;

public int getlength(){
	
	return search.length;
}

public void getSeachName(String names){
	
	if(this.index<this.getlength()){
		
		
		System.out.println("array not full");
		search[index] = names;
		index++;
	}else{
		
		System.out.println("array is full");
	}
	
}
public String readTheNames(){
	
	for(int index=0;index<getlength();index++){
		
		System.out.println("search engnies are:"+search[index]);
	}
	return "done";
	
}
public String updateSearchName(String oldname,String newname){
	
	for(int index=0;index<getlength();index++){
		
		if(search[index] == oldname){
			
			search[index] = newname;
			return "succesfully updated";
		}
	}return "not updated";
}
public String deleteSearchName(String searchname){
	
	for(int index=0;index<getlength();index++){
		
		if(search[index]==searchname){
	        search[index] = null;
			return "delete succesfully";
		}
	}return "not delete";
}
public String searchByNames (String names){
			for(String name :search ){
			if(names == name){
			return "Found :"+names;
			}
		}
		return "Search result not found";
}