public class WireRunner{

public static void main(String args[]){

Wire wires = new Wire();
System.out.println(wires);


int arr[] = {1,2,3,4};
Wire wire   =   new Wire(1000,"wipro",(short)9,14.f,arr);

System.out.println(wire);

Wire wire1   =   new Wire(1000,"wipro",(short)9,14.f,arr);

System.out.println(wire1);

Wire wire2   =   new Wire(1000,"wipro",(short)9,14.f,arr);

System.out.println(wire2);

Wire wire3  =   new Wire(1000,"wipro",(short)9,14.f,arr);

System.out.println(wire3);


}



}