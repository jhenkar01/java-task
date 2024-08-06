public class GaanaRunner{
public static void main(String[] args){
Gaana song = new Gaana();
int length = song.getlength();
		System.out.println("length is:"+length);
		song.createbySongname("robert");
		song.createbySongname("kaatera");
		song.createbySongname("odeya");
		song.createbySongname("moggina manasu");
		song.createbySongname("geetanjali");
		song.songreadby();
		System.out.println("----------update--------");
		song.songupdateby("robet","shastri");
		song.songreadby();
		System.out.println("----------delete--------");
		song.songdeleteby("odeya");
		song.songreadby();
		System.out.println("----------search--------");
		String songs = song.searchBySongNames("kaatera");
		System.out.println(songs);
		song.songreadby();
 }
}