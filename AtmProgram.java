package Akash;
import java.util.Scanner;
public class AtmProgram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int pin=1234;
		float balance=10000f;
		char restart='y';
		System.out.print("Enter your Atm pin:");
		int enteredPin=input.nextInt();
		if(pin==enteredPin) 
		{
			while(restart=='y')
			{
				System.out.println("Do you want to withdraw your balance,Press 1");
				System.out.println("Do you want to credit your balance,Press 2");
				System.out.println("Do you want to check your balance,Press 3");
				System.out.println("Do you want to Quit the process,Press 4");
				System.out.print("\n Enter your Choice:");
				int choice=input.nextInt();
				if(choice==1) {
					System.out.print("enter your amount:");
					int Amount=input.nextInt();
					balance=balance-Amount;
					System.out.println("Your current account balance = "+balance);
					System.out.println("do you want to continue press y or press n to Quit?");
					restart=input.next().charAt(0);
				}
				else if(choice==2) {
					System.out.println("enter your amount:");
					int Amount1=input.nextInt();
					balance=balance+Amount1;
					System.out.println("Your current account balance = "+balance);
					System.out.println("do you want to continue press y or press n to Quit?");
					restart=input.next().charAt(0);
				}
				else if(choice==3) {
					System.out.println("Your current account balance = "+balance);
					System.out.println("do you want to continue press y or press n to Quit?");
					restart=input.next().charAt(0);
				}
				else if(choice==4) {
					break;
				}
				else {
					System.out.println("Invaid Choice");
					
				}

		}
		}
		
		else
			System.out.println("You Entered Wrong Pin");
	}

}
