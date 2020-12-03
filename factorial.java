package Akash;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		/*System.out.print("enter a number:");
		int a=reader.nextInt();
		int c=1;
		for(;a>0;--a) {
			c=c*a;
		}
		System.out.println(c);'*/
		
		//Exponential
		System.out.print("enter base number:");
		int a=reader.nextInt();
		System.out.print("enter exponent number:");
		int b=reader.nextInt();
		long c=1;
		for(;b>0;--b) {
			c=c*a;
		}
		System.out.println(c);
	}

}
