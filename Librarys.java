public class Librarys {

   
    String libraryName;
    String libraryAddress;
    int totalBooks;
    int totalMembers;
    String libraryTimings;
    char libraryGrade;
    float libraryRating;
    double librarySize;
    String libraryType;
    boolean isOpen;

  
    public Librarys() {
        System.out.println("The constructor with no argument is defined");
    }

   
    public Librarys(String libraryName, String libraryAddress, int totalBooks, int totalMembers,
					String libraryTimings, char libraryGrade, float libraryRating, double librarySize,
					String libraryType, boolean isOpen) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.totalBooks = totalBooks;
        this.totalMembers = totalMembers;
        this.libraryTimings = libraryTimings;
        this.libraryGrade = libraryGrade;
        this.libraryRating = libraryRating;
        this.librarySize = librarySize;
        this.libraryType = libraryType;
        this.isOpen = isOpen;
    }

 
    public void issueBook() {
        System.out.println("Book is being issued");
    }

    public void displayLibraryName(String libraryName) {
        System.out.println("Library Name: " + libraryName);
    }

    public boolean isLibraryOpen() {
        System.out.println("Library is open");
        return true;
    }

    public String libraryDetails(String libraryName, int totalBooks) {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
        return "Library is Excellent";
    }

 
    public static void main(String args[]) {
        Librarys library1 = new Librarys();

        Librarys library2 = new Librarys("City Library", "123 Main St", 5000, 1200, "9 AM - 8 PM", 'A', 9.5f, 2000.5, "Public", true);

        Librarys library3 = new Librarys();
        library3.issueBook();
        library3.displayLibraryName("Downtown Library");
        library3.isLibraryOpen();
        library3.libraryDetails("City Library", 5000);
    }
}
