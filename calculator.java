package Akash;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		Scanner value =new Scanner(System.in);
		System.out.print("enter 1st value:");
		float first=value.nextFloat();
		System.out.print("enter 2nd value:");
		float second=value.nextFloat();
		System.out.print("choose a operator(+,-,*,/):");
		char operator=value.next().charAt(0);
		double result;
		switch(operator){
			case '+':
				result=first+second;
				break;
			case '-':
				result=first-second;
				break;
			case '*':
				result=first*second;
				break;
			case '/':
				result=first/second;
				break;
			default:
				System.out.print("operator does not mismatch:");
				return;
		}
		System.out.printf("%.1f%c%.1f=%.1f",first,operator,second,result);
					
				
		
	}

}
