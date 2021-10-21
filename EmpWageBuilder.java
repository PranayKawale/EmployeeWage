package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {

	public static void empWageForMonth(int num){
		int Wage_Per_HR = 20;
		int Day_HRs = 8;
		int PartTime_HRs = 8;
		int Working_Days = 20;
		double dailywage = 0;
		double monthlywage = 0;

		for (int i =0; i<Working_Days; i++){
			switch (num){
			case 1:
				dailywage = Wage_Per_HR * Day_HRs * i;

				break;
			case 2:
				dailywage = Wage_Per_HR * (Day_HRs + PartTime_HRs) * i;
				break;
			case 0:
				break;

			}
			monthlywage = monthlywage + dailywage;
		}
		System.out.println("Monthly Wage : " + monthlywage);


	}

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(3);
		empWageForMonth(a);

	}


}