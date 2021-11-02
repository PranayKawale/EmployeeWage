package com.bridgelabz;

public class CompanyEmpWage {

	public final String company ;
	public final int wagePerHour;
	public final int workingDays ;
	public final int maxHrsPerMonth;
	public int totalEmpWage;
	
	public    CompanyEmpWage(String company,int wagePerHour, int workingDays, int maxHrsPerMonth) {
		this.company = company;
		this.wagePerHour=wagePerHour;
		this.workingDays=workingDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}
	@Override
	public String  toString() {
		return "Total Emp Wage for Company : " +company+ " is: " +totalEmpWage ;
	}



}
