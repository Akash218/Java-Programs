package Akash;
import java.util.Scanner;
public class pallindrom {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("enter a string:");
		String str1=reader.next().strip();
		String str2="".strip();
		for(int b=str1.length()-1;b>=0;b--) {
			str2=str2+str1.charAt(b);
			}
        
                //comparing two strings are equal//
		if(str1.equals(str2)){
			System.out.println(str1+" is a Pallindrom");
		}
		else {
			System.out.println(str1+" is not a pallindrom");
		}
	}
}

