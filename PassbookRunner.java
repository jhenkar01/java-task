public class PassbookRunner{

public static void main(String args[]){
	
Passbook passbook  =	new Passbook();
passbook.setholdername("Naresh");
System.out.println(passbook.getholdername());
passbook.setaccno(967453208);
System.out.println(passbook.getaccno());
passbook.setaddres("bangaluru");
System.out.println(passbook.getaddres());
passbook.setbalance(2.6f);
System.out.println(passbook.getbalance());
passbook.setyes(true);
System.out.println(passbook.getyes());

if(passbook.getholdername() == "Naresh" && passbook.getaccno() == 87654899){
	
	
	System.out.println("correct acc:"+passbook.getholdername());
}
else{
	
	System.out.println("invalid account");
}
	
	if(passbook.getaddres() == "bangaluru" || passbook.getbalance() == 2.8f){
		
		
		System.out.println("valid account");
	}
	else{
		
		System.out.println("invalid account type");
	}
	
	if(passbook.getholdername() == "naresh"){
		
		System.out.println("valid usename");
	}
	else{
		
		System.out.println("invalid user");
	}
	if(passbook.getaccno() != 12345678){
		
		System.out.println("valid acc no");
	}
	else{
		
		System.out.println("invalid acc no");
	}
}

}