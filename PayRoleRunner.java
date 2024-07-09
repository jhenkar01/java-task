public class PayRoleRunner{

public static void main(String args[]){

PayRole.salary();
PayRole.salary(3);
PayRole.salary(4,7.5f);
PayRole.salary(4,7.5f,0.8765);
PayRole.salary(4,7.5f,0.8765,'j');
PayRole.salary(8);
PayRole.salary(4,7.5f,0.8765,'j',true);
PayRole.salary(4,7.5f,0.8765,'j',true,7);
PayRole.salary(4,7.5f,0.8765,'j',true,7,'k');
PayRole.salary(4,7.5f,0.8765,'j',true,7,'k',1234556);
PayRole.salary(4,7.5f,0.8765,'j',true,7,'k',1234556,"fine");
PayRole.salary(4,7.5f,0.8765,'j',true,7,'k',1234556,"fine","tired");
}
}