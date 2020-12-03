package Akash;

import java.util.Arrays;

public class workout {

	public static void main(String[] args) {
		/*long num=100282292977L;
		float num1=20.635f;
		double num2=30.346286;
		char alphabet='A';
		String words="Akash is a Developer";
		boolean bool=true;
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(alphabet);
		System.out.println(words);
		System.out.println(bool);*/
		
		//Array:method 1
		/*int[] num=new int[] {10,20,30,40};
		System.out.println(Arrays.toString(num));
		System.out.println(num[0]);
		//Array:method 2
		
		float[] decimal=new float[4];
		decimal[0]=1.5f;
		decimal[1]=2.5f;
		decimal[2]=3.5f;
		System.out.println(Arrays.toString(decimal));
		System.out.println(decimal[0]);
		System.out.println(decimal[3]);
		
		//Array:method 3
		int[] num1= {1,2,3,4,5};
		System.out.println(Arrays.toString(num1));
		System.out.println(num1[2]);
		
		char[] alphabets= {'a','b','c','d','e'};
		System.out.println(Arrays.toString(alphabets));
		System.out.println(alphabets[2]);
		System.out.println(alphabets.length);
		 
		//clone method
		char[] letters=alphabets.clone();
		System.out.println(Arrays.toString(letters));
		
		//Array 2:Dimentions
		int[][] num= {{1,2,3,4,5},{10,20,30,40}};
		System.out.println(Arrays.deepToString(num));
		*/
		//string methods
		
		/*String para="   Akash Is A Developer"+"And Also a Devops Engineer";
		System.out.println(para);
		System.out.println(para.length());
		System.out.println(para.toUpperCase());
		System.out.println(para.toLowerCase());
		System.out.println(para.trim());
		System.out.println(para.strip());
		System.out.println(para.startsWith(" "));
		System.out.println(para.endsWith("Engineer"));
		System.out.println(para.stripLeading());
		*/
		/*
		int base=3,exponent=4;
		for (long a=1;exponent!=0;--exponent) {
			a*=base;
			System.out.println(a);
		}
        */
		
		//Terinary operator
		/*
		int age=11;
		String name=age>=18? "Eligible for voting" : "not eligible for voting";
		System.out.println(name);*/
	double num=1.23;
	float num1=635.323f;
	System.out.println(Math.ceil(num));
	System.out.println(Math.floor(num1));
	System.out.println(Math.max(num,num1));
	System.out.println(Math.random());
	System.out.println(Math.exp(num));
	String a="run";
	StringBuffer b=new StringBuffer(a).reverse();
	System.out.println(b);
	}
	
}

