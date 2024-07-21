public class JddetRunner{

public static void main(String args[]){


new Jddet();


 Jddet jobs =  new Jddet("iquia");
 
Jddet jobs1 = new Jddet("iquia","developer");

Jddet jobs2 = new Jddet("tech mahinda","tester",35000);

Jddet jobs3 = new Jddet("tech mahinda","tester",35000,(short)5);


String loc[]  = {"iquia","tech mahinda"};


Jddet jobs4 = new Jddet("tech mahinda","tester",35000,(short)5,loc);

Jddet jobs5 = new Jddet("tech mahinda","tester",35000,(short)5,10.1f,true);

Jddet jobs6 = new Jddet("tech mahinda","tester",35000,(short)5,10.1f,true,123456);

Jddet jobs7 = new Jddet("tech mahinda","tester",35000,(short)5,10.1f,true,123456,(byte)7);

String lo[] = {"iquia","tech"};
Jddet jobs8= new Jddet("tech mahinda","tester",35000,(short)5,10.1f,true,123456,(byte)7,lo);


String lc[] = {"iquia","tech"};
int det[]  = {1,2,3};
Jddet jobs9= new Jddet("tech mahinda","tester",35000,(short)5,10.1f,true,123456,(byte)7,lc,det);

}



}