package Interview_Program;

import java.util.Scanner;

public class Armstrong_Number_S {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number :");
int num=sc.nextInt();
int add=num;
int result=0;

while (add>0) {
	int remd=add%10;
	result=result+(remd*remd*remd);
	add=add/10;
	}
if (result==num) {
	System.out.println("Given number is aramstrong:"+ result);
}
else {
	System.out.println("Given number is not aramstrong:"+ result);
	}
}
	
}


