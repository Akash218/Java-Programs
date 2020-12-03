package Akash;

public class Fibnocii {
	public static void main(String[] args) {
		int num=100,f=0,s=1;
		while(num>f){
			System.out.print(f+"+");
			int sum=f+s;
			f=s;
			s=sum;
		}
	}

}
