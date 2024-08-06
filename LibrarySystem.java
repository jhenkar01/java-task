public class LibrarySystem{

String book[] = new String[4];
int index =0;

public int lengthbook(){
	
	
	return book.length;
}

public String getinformation(String name){
	
	if(this.index<this.lengthbook()){
		
		System.out.println("not full");
		
		book[index] = name;
		index++;
		
		}else{
			
			System.out.println("full");
		}return "ok";
		}
public void  libDetails(){
	for(int index=0;index<this.lengthbook();index++){
		System.out.println("Available book are:"+this.book[index]);
	}
}
}