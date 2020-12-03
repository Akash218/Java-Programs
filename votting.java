package Akash;

import java.util.Scanner;

public class votting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int pinForStartElection=1234;
		int pinForPageAccess=5678;
		int countOfDMK=0;
		int countOfADMK=0;
		int countOfBJP=0;
		int countOfCPI=0;
		int countOfINC=0;
		char restart='y';
		System.out.print("enter pin to start election:");
		int pin=input.nextInt();
		if (pin==pinForStartElection) {
			while (restart=='y'){
				System.out.println("vote for DMK,Press 1");
				System.out.println("vote for ADMK,Press 2");
				System.out.println("vote for BJP,Press 3");
				System.out.println("vote for CPI,Press 4");
				System.out.println("vote for INC,Press 5");
				System.out.println("Press 6 to show Result,only admin can do it with password");
				System.out.println("Press 7 to Stop Election,only admin can do it with password");
				System.out.print("\n Enter your choice:");
				int choice=input.nextInt();
				switch(choice) {
				case 1:
					System.out.print("For confirm,click y or press other key for previous page:");
					char confirm=input.next().charAt(0);
					if(confirm=='y') {
						countOfDMK+=1;
						restart='y';
					}
					else
						restart='y';
					break;
				case 2:
					System.out.print("For confirm,click y or press other key for previous page:");
					char confirm1=input.next().charAt(0);
					if(confirm1=='y') {
						countOfADMK+=1;
						restart='y';
					}
					else
						restart='y';
					break;				
					
				case 3:
					System.out.print("For confirm,click y or press other key for previous page:");
					char confirm2=input.next().charAt(0);
					if(confirm2=='y') {
						countOfBJP+=1;
						restart='y';
					}
					else
						restart='y';
					break;
				case 4:
					System.out.print("For confirm,click y or press other key for previous page:");
					char confirm3=input.next().charAt(0);
					if(confirm3=='y') {
						countOfCPI+=1;
						restart='y';
					}
					else
						restart='y';
					break;
				case 5:
					System.out.print("For confirm,click y or press other key for previous page:");
					char confirm4=input.next().charAt(0);
					if(confirm4=='y') {
						countOfINC+=1;
						restart='y';
					}
					else
						restart='y';
					break;
				case 6:
					System.out.print("enter pin to Access this page:");
					int confirm5=input.nextInt();
					if(confirm5==pinForPageAccess) {
						System.out.println("Total number of votes Received for DMK = "+countOfDMK);
						System.out.println("Total number of votes Received for ADMK = "+countOfADMK);
						System.out.println("Total number of votes Received for BJP = "+countOfBJP);
						System.out.println("Total number of votes Received for CPI = "+countOfCPI);
						System.out.println("Total number of votes Received for INC = "+countOfINC);
						System.out.print("\n For continue,press any key");
						String confirm6=input.next();
						if(confirm6=="y")
							restart='y';
						else
							restart='y';
						break;
					}
					else
						System.out.println("Invalid Pin?");
				case 7:
					System.out.print("Enter Election pin to Stop Election:");
					int pinToStop=input.nextInt();
					if(pinToStop==pinForStartElection) {
						restart='a';
					}
					else
						System.out.println("invalid pin?");
					break;
				default:
					System.out.println("invalid choice?");
					restart='y';
					
				}
				
			}
		}
		
		else
			System.out.println("invalid pin?");

	}

}
