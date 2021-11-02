package com.bridgelabz;

public class EmpWageBuilderArray {
	public static final int Is_Part_Time = 1;
	public static  final int Is_full_Time = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company, int wagePerHour, int workingDays, int maxHrsPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, wagePerHour, workingDays, maxHrsPerMonth);
	numOfCompany++ ;
	}
	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//variables
		int empHrs = 0 ,totalEmpHrs = 0, totalWorkingDays = 0;
		//Computation
		while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.workingDays) {
			totalWorkingDays++ ;
			int empCheck = (int) (Math.floor(Math.random() * 10)% 3) ;
			switch (empCheck){
			case Is_Part_Time:
				empHrs = 4 ;
				break;
			case Is_full_Time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				
		}
			totalEmpHrs += empHrs ;
			System.out.println("Day# " +totalWorkingDays + " Emp Hr :" +empHrs);
	}
	return totalEmpHrs *companyEmpWage.wagePerHour;
}
	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
	}
}