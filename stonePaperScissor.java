package Akash;

import java.util.Scanner;

public class stonePaperScissor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] choice= {"stone","paper","scissor"};
		int points=0;
		while(true) {
			int randomNumber=(int)(Math.random()*choice.length);
			String randomChoose=choice[randomNumber];
			System.out.println("Enter your choice(stone,paper,scissor):");
			String save=input.next();
			if (randomChoose.equals(save)) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				System.out.println("points remain same");	
			}
			else if(randomChoose.equals("stone") && save.equals("paper")) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				points+=1;
				System.out.println("you earned one point,your point is = "+points);
			}
			else if(randomChoose.equals("stone") && save.equals("scissor")) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				points-=1;
				System.out.println("you loose one point,your point is = "+points);
			}
			else if(randomChoose.equals("paper") && save.equals("stone")) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				points-=1;
				System.out.println("you loose one point,your point is = "+points);
			}
			else if(randomChoose.equals("paper") && save.equals("scissor")) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				points+=1;
				System.out.println("you earned one point,your point is = "+points);
			}
			else if(randomChoose.equals("scissor") && save.equals("stone")) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				points+=1;
				System.out.println("you earned one point,your point is = "+points);
			}
			else if(randomChoose.equals("scissor") && save.equals("paper")) {
				System.out.println("Your choice is = "+save);
				System.out.println("computer choice is = "+randomChoose);
				points-=1;
				System.out.println("you loose one point,your point is = "+points);
			}
			else {
				System.out.println("invaild Choice?");
				break;
			}
		}

			
	}

}

