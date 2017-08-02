package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*This is the project taht displays the different
date between the birth date and current date
@author Ratna
*/

public class Date {  
	public static void main(String args[]) {
		 
		  	LocalDate now = LocalDate.now();
		  	LocalDate birth =null;
		  	Scanner scn = new Scanner(System.in);	               
		
	        System.out.print("Enter the date of birth in 'yyyy/mm/dd' format): ");
	        String date = scn.nextLine();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	        
	        try {
				birth = LocalDate.parse(date, formatter);
			} catch (DateTimeParseException e) {
				System.out.println("Enter the anydate in 'yyyy/mm/dd' fomrat:");
			}
	        Period age = Period.between(birth, now);
	        long days =ChronoUnit.DAYS.between(birth, now);
	        System.out.println("Days different between now and  birthday you entered: "+days);
//	        + days +"and" + "Your age is " + age.getYears()
//	        		+ age.getMonths() +" and " + age.getDays());        
	        	                

	        //System.out.printf("Difference: %d day(s)", days);

	    } 

}
