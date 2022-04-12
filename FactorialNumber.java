import java.util.*;

class FactNum{
	static void fnum(int number) {
		
	int factorial = 1;	
	for( int i = number;i>=1; i--) {
		factorial = factorial*i;				
		}
		System.out.print("Factorial of "+number  +" = "+factorial);
      }
}
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number :- ");
		int fnum = sc.nextInt();
		
		FactNum.fnum(fnum);		
		}
    }
