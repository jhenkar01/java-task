public class TvChannelRunner{

public static void main(String args[]){

TvChannel ch = new TvChannel();
System.out.println(ch);


String chnames[] = {"work","hard"};
String chnames1[] ={"today","tommorow"};
String chnames2[] ={"morning","evening"};


 TvChannel tvchannel  =   new TvChannel("tv9",19,(short)7,"useful",chnames );

System.out.println(tvchannel);



TvChannel tvchannel1  =   new TvChannel("public",18,(short)9,"useful",chnames1 );

System.out.println(tvchannel1);


TvChannel tvchannel2  =   new TvChannel("zee",17,(short)8,"useful",chnames2 );

System.out.println(tvchannel2);


TvChannel tvchannel3  =   new TvChannel("etv",8,(short)5,"useful",chnames1 );

System.out.println(tvchannel3);


}}