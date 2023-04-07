package Interview_Program;

import java.util.Scanner;

public class wapping_two_number_WITH_WITHOUT {

	public static void main(String[] args) {
		//wapping_two_number
//		int a=10;
//		int b= 20;
//		int c=a;

//		a=b;
//		b=c;
//		System.out.println("Value of a is :"+a);
//		System.out.println("Value of b is :"+b);

		//wapping_two_number
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:");

		int x =sc.nextInt();
		int y = sc.nextInt();

		x=x+y;                    //suppose x=x+y (10+20=30) x=30 
		y=x-y;                    //suppose y=x-y (30-10=20) y=20 
		x=x-y;                    //suppose x=x-y (30-20=10) x=10 

		System.out.println ("number of x afetr swapping:"+x);
		System.out.println ("number of y afetr swapping:"+y);
		
		
		
	}

}
