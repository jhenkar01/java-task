public class LibrarySystemRunner{
public static void main(String args[]){

LibrarySystem lib = new LibrarySystem();
lib.lengthbook();
System.out.println(lib.lengthbook());

lib.getinformation("marvel");
lib.libDetails();
lib.getinformation("anime");
lib.libDetails();
lib.getinformation("spiderman");
lib.libDetails();
lib.getinformation("panda");
lib.libDetails();


}
}