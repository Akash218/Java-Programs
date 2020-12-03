package Akash;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter 1st number:");
		float num1=input.nextFloat();
		System.out.print("enter 2nd number:");
		float num2=input.nextFloat();
		double result;
		System.out.print("enter a operator(*,/,+,-,@):");
		char character=input.next().charAt(0);
		switch(character) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '@':
			double c=1;
			for(;num2>0;--num2) {
				c=c*num1;
			}
			result=c;
			break;
		default:
			System.out.println("invalid operator?");
			return;	
		}
		System.out.println(result);

	}

}
