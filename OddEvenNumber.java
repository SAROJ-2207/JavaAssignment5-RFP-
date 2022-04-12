import java.util.*;

class OddEvenNumber {
	public static void main(String args[]){
	
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter Any Number :- ");
	int num = obj.nextInt();
	
	if (num>0){
			if(num%2==0) System.out.print(num+" is a Even Number");
			else if (num%2!=0) System.out.print(num+" is a Odd Number");
	}
	else System.out.print(num+" Invalid Number Input");
	}
   }
 