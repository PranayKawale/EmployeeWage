package com.bridgelabz;

import java.util.Random;



public class EmpWageBuilder {

	public static   int Full_Time_HRs = 8;
	public static  int PartTime_HRs = 4;
	double dailywage = 0;
	double monthlywage = 0;

	int workingDays ;
	int wagePerHour;

	public  void setVariables(int x, int y) {
		this.workingDays=x;
		this.wagePerHour=y;
	}




	public  void wageForMultplCompny(){
		Random random = new Random();
		int empCheck = random.nextInt(3);


		for (int i =0; i< workingDays; i++){

			switch (empCheck){
			case 1:
				dailywage = wagePerHour * Full_Time_HRs * i;
				break;
			case 2:
				dailywage = wagePerHour * (Full_Time_HRs + PartTime_HRs) * i;
				break;
			case 0:
				break;

			}
			monthlywage = monthlywage + dailywage;
		}
		System.out.println( monthlywage);
	}



	public static void main(String[] args) {



		EmpWageBuilder Tata = new EmpWageBuilder();
		System.out.println("Monthley wage for Tata company is ");
		Tata.setVariables(20, 50);
		Tata.wageForMultplCompny();



		EmpWageBuilder Hcl = new EmpWageBuilder();
		System.out.println("Monthley wage for Hcl company is ");
		Hcl.setVariables(25, 55);
		Hcl.wageForMultplCompny();

		EmpWageBuilder Infosys = new EmpWageBuilder();
		System.out.println("Monthley wage for Infosys company is ");
		Infosys.setVariables(30, 60);
		Infosys.wageForMultplCompny();

	}
}