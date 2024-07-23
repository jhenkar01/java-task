 public class LibrarysRunner{
 public static void main(String args[]) {
        Librarys library1 = new Librarys();

        Librarys library2 = new Librarys("City Library", "123 Main St", 5000, 1200, "9 AM - 8 PM", 'A', 9.5f, 2000.5, "Public", true);

        Librarys library3 = new Librarys();
        library3.issueBook();
        library3.displayLibraryName("Downtown Library");
        library3.isLibraryOpen();
        library3.libraryDetails("City Library", 5000);
    }}