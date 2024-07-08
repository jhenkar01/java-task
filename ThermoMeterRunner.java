public class ThermoMeterRunner{

public static void main(String args[]){

ThermoMeter.drill();
ThermoMeter.drill("bosh",120);
ThermoMeter.drill("bosh");
System.out.println(ThermoMeter.drill("bosh"));
String cmp[] = {"lg","samsung"};
System.out.println(ThermoMeter.drill(cmp));
}
}