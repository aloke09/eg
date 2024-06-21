package p1;

import java.util.Random;

public class Emp_wage
{

    public static void main(String[] args)
    {
        final  int FULL_TIME=1;
        final  int PART_TIME=2;
        final int EMP_RATE_PER_HR=250;
        final int TOTAL_NO_OF_WORKING_DAYS=20;
        final int MAX_HRS_IN_MONTH=100;

        int empHrs=0,no_of_days_worked=0;
        int totalWorkingHR=0;
        Random r=new Random();
        int check=0;
        while(totalWorkingHR<=MAX_HRS_IN_MONTH && no_of_days_worked<TOTAL_NO_OF_WORKING_DAYS)
        {
            no_of_days_worked++;
            check=r.nextInt(0,3);
            switch (check)
            {
                case FULL_TIME :
                    empHrs=8;
                    break;
                case PART_TIME:
                    empHrs=4;
                    break;
                default://0 for absent
                    empHrs=0;
//                    break;
            }
            totalWorkingHR=totalWorkingHR+empHrs;
            System.out.println("Day "+no_of_days_worked+" hour "+empHrs);
        }
        System.out.println(totalWorkingHR);
        int totalEmpWage=totalWorkingHR*EMP_RATE_PER_HR;
        System.out.println("Total employee wage "+totalEmpWage);
    }
}
