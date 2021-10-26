package com.bridgelabz;

import java.util.Random;





public class EmpWageBuilder {

	public static   int Full_Time_HRs = 8;
	public static  int PartTime_HRs = 8;
	double dailywage = 0;
	
	 int totalEmpHrs = 0;
     int empHrs = 0;
     int totalWorkingDays = 0;
     double monthlywage = 0;

	int workingDays ;
	int wagePerHour;
	int maxHrsPerMonth;
	public  void setVariables(int x, int y,int z) {
		this.workingDays=x;
		this.wagePerHour=y;
		this.maxHrsPerMonth=z;
	}



	public  void empWageStats(){
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
        monthlywage = totalEmpHrs * wagePerHour;
        System.out.println("Monthly Wage : " + monthlywage);


    }



	public static void main(String[] args) {


		EmpWageBuilder Tata = new EmpWageBuilder();
		System.out.println("Monthley wage for Tata company is ");
		Tata.setVariables(20, 50 ,100);
		Tata.empWageStats();


		EmpWageBuilder Hcl = new EmpWageBuilder();
		System.out.println("Monthley wage for Hcl company is ");
		Hcl.setVariables(25, 55 , 110);
		Hcl.empWageStats();
		
		EmpWageBuilder Infosys = new EmpWageBuilder();
		System.out.println("Monthley wage for Infosys company is ");
		Infosys.setVariables(30, 60 , 120);
		Infosys.empWageStats();

	}
}