import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Any Year :- ");
			int count=0;
			
			int year = sc.nextInt();
			int yr =year;
			while(year!=0){
		         year = year/10;
		         count++;
				}				
		    if(count==4) {
				    	
		    				if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 
		    				{		    		  
		    					System.out.println( yr +" :- This Is A leap Year...");
		    				}
		    }
		    	else {
				System.out.println( yr +" :- This Is Not A leap Year...");
		    	}
	    }
     }
  
