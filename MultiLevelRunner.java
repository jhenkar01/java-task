package com.xworkz.achive_inheritance.runner;

import com.xworkz.achive_inheritance.things.Company;
import com.xworkz.achive_inheritance.things.Job;
import com.xworkz.achive_inheritance.things.Salary;

public class MultiLevelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company cmy = new Company();
		cmy.length = 7.5f;
		cmy.name = "amazon";
		cmy.no = 7;
		System.out.println(cmy.length);
		System.out.println(cmy.name);
		System.out.println(cmy.no);
		
		Job job = new Job();
		job.lenth = 68879;
		job.names = "devloper";
		job.value = true;
		System.out.println(job.length);
		System.out.println(job.names);
		System.out.println(job.value);
		
		Salary sal = new Salary();
		
	}

}
