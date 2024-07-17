public class BoatRunner{

public static void main(String args[]){

new Boat();


String boats[] = {"titanic","talwar"};

Boat boat1 = new Boat(23000,"talwar",(short)8,67.9f,boats);

System.out.println(boat1);

Boat boat2 = new Boat(30000,"vikramaditya",(short)8,67.9f,boats);

System.out.println(boat2);


Boat boat3 = new Boat(12000,"kalvari",(short)8,67.9f,boats);

System.out.println(boat3);

Boat boat4 = new Boat(83000,"magar",(short)8,67.9f,boats);

System.out.println(boat4);

Boat boat5 = new Boat(73000,"vikrant",(short)8,67.9f,boats);

System.out.println(boat5);

}


}