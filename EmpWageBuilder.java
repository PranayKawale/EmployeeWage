package com.bridgelabz;

import java.util.Random;

public class EmpWageBuilder {

	public static void empWageForMonth(int num){
		int Wage_Per_HR = 20;
        int Day_HRs = 8;
        int Part_Time_Hrs = 4;
        int Days = 20;
        int Max_HRs_Per_Month = 100;

        int totalEmpHrs = 0;
        int empHrs = 0;
        int totalWorkingDays = 0;
        double monthlywage = 0;

        while (totalEmpHrs <= Max_HRs_Per_Month && totalWorkingDays < Days){
            totalWorkingDays++;
            switch (num){
                case 1:
                    empHrs = Day_HRs;
                    
                    break;
                case 2:
                    empHrs = Part_Time_Hrs;
                    break;
                case 0:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        monthlywage = totalEmpHrs * Wage_Per_HR;
        System.out.println("Monthly Wage : " + monthlywage);


    }

    public static void main(String[] args) {
       
        Random random = new Random();
        int a = random.nextInt(3);
        empWageForMonth(a);

    }
}