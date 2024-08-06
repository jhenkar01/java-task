public class ChacoRunner{

public static void main(String args[]){

Chaco chacos = new Chaco();
//Chaco chacos1 = new Chaco(200);
Chaco chacos2 = new Chaco("crem",99);

chacos.kitkat();
chacos.dairymilk(100);
chacos.milkybar();
System.out.println(chacos.milkybar());
chacos.kissme("nestle");
}
}