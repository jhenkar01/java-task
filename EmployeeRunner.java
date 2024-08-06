public class EmployeeRunner{
public static void main(String args[]){

  Employee emp =  new Employee();
  Employee emp1 = new Employee("xx");
int sal[] = {50000,34700,9800,7833};
Employee emp2 = new Employee(sal);
emp2.highestSal(sal);
emp2.lowestsal(sal);


}


}