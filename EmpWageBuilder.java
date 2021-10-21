package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {

	public static void empStatus(int num){
		int Wage_Per_HR = 20;
		int Day_HRs = 8;
		int PartTime_HRs = 8;

		if(num == 1){
			System.out.println("Employee Present");
			System.out.println("DailyWage = " + Wage_Per_HR * Day_HRs);
		}
		else if(num == 2){
			System.out.println("Employee Present");
			System.out.println("DailyWage  Part Time = " + Wage_Per_HR * (Day_HRs + PartTime_HRs));
		}

		else{
			System.out.println("Employee Absent");
			System.out.println("DailyWage = " +0);
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation Program");

		Random randm = new Random();
		int r = randm.nextInt(3);
		empStatus(r);
	}

}
