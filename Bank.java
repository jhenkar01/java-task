package com.amazon.encapsulation.things;

public class Bank {
	
	private int bank_acc_no;
	private String acc_holder_name;
	private String bank_name;
	private float bank_balance;
	private int adhar_no;
	
	public void setbankno(int bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}
	
	public int getbankno() {
		
		return this.bank_acc_no;
	}
	
	public void setHolderName(String acc_holder_name) {
		
		this.acc_holder_name = acc_holder_name;
	}
	public String getHolderName() {
		
		return this.acc_holder_name;
	}
	public void setBankName(String bank_name) {
		
		this.bank_name = bank_name;
	}

	public String getBankName() {
		
		return this.bank_name;
	}
	public void setBankBalance(int bank_balance) {
		
		this.bank_balance = bank_balance;
	}
	public float getBankBalance() {
		
		return this.bank_balance;
	}
	public void setAdharNo(int adhar_no) {
		
		this.adhar_no = adhar_no;
	}
	public int getAdharNo() {
		
		return this.adhar_no;
	}
};
