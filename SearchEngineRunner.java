public class SearchEngineRunner{

public static void main(String args[]){


SearchEngine seachengine = new SearchEngine();
System.out.println("length of the array:"+seachengine.getlength());
seachengine.getSeachName("global");

seachengine.getSeachName("crome");
seachengine.getSeachName("google");
seachengine.getSeachName("eclipse");
seachengine.getSeachName("gpt");
seachengine.readTheNames();
System.out.println("------update--------");
seachengine.updateSearchName("crome","jhen");
seachengine.readTheNames();
System.out.println("------delete-------");
seachengine.deleteSearchName("eclipse");
seachengine.readTheNames();
System.out.println("----------search--------");
String name = seachengine.searchbyNames("eclipse");
System.out.println();
seachengine.readTheNames();
 }
}
}

}