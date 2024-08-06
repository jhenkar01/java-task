package com.flipkart.single_inheritance.runner;

import com.flipkart.single_inheritance.things.Crome1;
import com.flipkart.single_inheritance.things.Google1;
import com.flipkart.single_inheritance.things.SearchEng;

public class Practic1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Google1 google = new Google1();
		google.name = "goo";
		google.no = 7;
		google.name = "goo";
		google.no = 8;
		System.out.println(google.name);
		System.out.println(google.no);
		google.search();
		
		SearchEng  sercheng =  new SearchEng();
		sercheng.name1  = "searchhh";
		sercheng.no1 = 5;
		System.out.println(sercheng.name1);
		System.out.println(sercheng.no1);
		sercheng.search1();

		Crome1 crome = new Crome1();
		crome.name2 = "ii";
		System.out.println(crome.name2);

}}
