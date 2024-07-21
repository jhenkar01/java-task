public class PostofficeRunner{

public static void main(String args[]){

new  Postoffice();

Postoffice postoffice1 = new Postoffice(1);

Postoffice postoffice2 = new Postoffice(1,"gov");

Postoffice postoffice3 = new Postoffice(1,"gov",4);

Postoffice postoffice4 = new Postoffice(1,"gov",4,(short)6);

Postoffice postoffice5 = new Postoffice(1,"gov",4,(short)6,345567);

Postoffice postoffice6 = new Postoffice(1,"gov",4,(short)6,345567,56.8f);

Postoffice postoffice7 = new Postoffice(1,"gov",4,(short)6,345567,56.8f,767.878);

Postoffice postoffice8 = new Postoffice(1,"gov",4,(short)6,345567,56.8f,767.878,100);

Postoffice postoffice9 = new Postoffice(1,"gov",4,(short)6,345567,56.8f,767.878,100,"gov officer");

Postoffice postoffice10 = new Postoffice(1,"gov",4,(short)6,345567,56.8f,767.878,100,"gov officer",30);
}
}