package com.amazon.encapsulation.runner;

import com.amazon.encapsulation.things.Bank;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank bank =	new Bank();
	bank.setbankno(1234556698);
	System.out.println(bank.getbankno());
	bank.setHolderName("naresh");
System.out.println(	bank.getHolderName());
    bank.setBankName("SBI");
    System.out.println(bank.getBankName());
    bank.setBankBalance(700);
    System.out.println(bank.getBankBalance());
    bank.setAdharNo(10);
    System.out.println(bank.getAdharNo());
    float intrest = 0.10f;
    float intrest2 = 0.20f;
    
    
    if(bank.getbankno()== 1234556698) {
    	
    	System.out.println("bank holder is:"+bank.getHolderName());
    	System.out.println("bank name is:"+bank.getBankName());
    }else {
    	
    	System.out.println("invalid acc no");
    }
    if(bank.getAdharNo()== 10) {
    	
    	System.out.println("corect adhar no");
    }else {
    	System.out.println("invalid adhar no");
    }
    if(bank.getBankBalance() < 500) {
    	System.out.println("please maintain bank balance");
    }else {
    	System.out.println("good u maintain bank balance");
    }
    if(bank.getBankBalance() > 500 && bank.getBankBalance() <10000) {
    	
    	System.out.println("total balance after interst add:"+bank.getBankBalance() + (bank.getBankBalance() * intrest) );
    }
    if(bank.getBankBalance() > 10000 && bank.getBankBalance() < 50000) {
    	
    	System.out.println("total balance after second interst add:"+bank.getBankBalance() + (bank.getBankBalance() * intrest2));
    }
    if(bank.getBankBalance() < 1000) {
    	System.out.println("account balance is low u can't withdraw");
    }
    if(bank.getBankBalance() > 1000) {
    	
    	System.out.println("remaing balance is:"+bank.getBankBalance());
    }
	}

}
