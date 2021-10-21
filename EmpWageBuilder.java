package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {

	public static void empStatus(int num){
		if(num == 1)
			System.out.println("Employee Present");
		else
			System.out.println("Employee Absent");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Program");

		Random randm = new Random();
		int r = randm.nextInt(2);
		empStatus(r);
	}

}
