package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {

	public static   int Full_Time_HRs = 8;
	public static  int PartTime_HRs = 8;
	double dailywage = 0;

	int totalEmpHrs = 0;
	int empHrs = 0;
	int totalWorkingDays = 0;
	double totalEmpWage = 0;

	private final String company ;
	private final int workingDays ;
	private final int wagePerHour;
	private final int maxHrsPerMonth;



	public    EmpWageBuilder(String company, int x, int y,int z) {
		this.company = company;
		this.workingDays=x;
		this.wagePerHour=y;
		this.maxHrsPerMonth=z;
	}



	public  void computeWage(){
		Random random = new Random();
		int empCheck = random.nextInt(3);


		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < workingDays){
			totalWorkingDays++;
			switch (empCheck){
			case 1:
				empHrs = Full_Time_HRs ;
				break;
			case 2:
				empHrs = PartTime_HRs;
				break;
			case 0:
				empHrs = 0;
				break;
			}
			totalEmpHrs = totalEmpHrs + empHrs;
		}
		totalEmpWage = totalEmpHrs * wagePerHour;
		System.out.println("Monthly Wage : " + totalEmpWage);
	}    
	public String  toString() {
		return "Total Emp Wage for Company : " +company+ " is: " +totalEmpWage ;
	}
	public static void main(String[] args) {


		EmpWageBuilder Tata = new EmpWageBuilder("Tata", 20,50,100);
		Tata.computeWage();
		System.out.println(Tata);

		EmpWageBuilder Hcl = new EmpWageBuilder("Hcl",25,55,110);
		Hcl.computeWage();
		System.out.println(Hcl);

		EmpWageBuilder Infosys = new EmpWageBuilder("Infosys", 30,60,120);
		Infosys.computeWage();
		System.out.println(Infosys);

	}
}