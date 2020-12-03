package Akash;

public class Loops {

	public static void main(String[] args) {
		//for loop
		/*for (int i=3;i>0;i--) {
			System.out.println("print 3 times");
		}
*/
		//While loop
		/*int i=6;
		while(i>0) {
			System.out.println("print 3 times");
			i--;
		}*/
		
		//do while
		/*int i=3;
		do {
			System.out.println("do-while loop");
			i--;
		}while (i>0);*/
		
		//for-each loop specially for array
		String Vegetables[]= {"onion","tomato","potato","carrat"};
		
		for(String vegetable: Vegetables) {
			System.out.println(vegetable);
		}
	}

}
