import java.util.*;

class LargestNumber {
	public static void main (String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number 1 : -");
			int num1 = sc.nextInt();
			System.out.print("Enter Number 2 : -");
			int num2 = sc.nextInt();
			System.out.print("Enter Number 3 : -");
			int num3 = sc.nextInt();
			
			if ((num1>num2) && (num1>num3)) 
				System.out.println(num1+" Is The Largest Among Three number");
			else if ((num2>num1) && (num2>num3))
				System.out.println(num2+" Is The Largest Among Three number");
			else System.out.println(num3+" Is The Largest Among Three number");
		}
	}