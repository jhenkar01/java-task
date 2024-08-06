public class MoviessRunner{
public static void main(String[] args){
Moviess song = new Moviess();
int length = song.getlength();
		System.out.println("length is:"+length);
		song.createbySongname("kantara");
		song.createbySongname("kirikparty");
		song.createbySongname("ssp");
		song.createbySongname("asn");
		song.createbySongname("maanikya");
		song.songreadby();
		System.out.println("----------update--------");
		song.songupdateby("asn","lucky");
		song.songreadby();
		System.out.println("----------delete--------");
		song.songdeleteby("ssp");
		song.songreadby();
		System.out.println("----------search--------");
		String songs = song.searchBySongNames("kantara");
		System.out.println(songs);
		song.songreadby();
 }
}