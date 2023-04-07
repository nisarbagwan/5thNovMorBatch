package Interview_Program;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int num;

		System.out.println("enter number is :-");
		num = x.nextInt();
		for (int i = 0; i <= num % 2; i++) {
			if (num % 2 == 0) {
				System.out.println("enete number is prime:"+num);

			} else {

				System.out.println("enete number is not prime:"+num);
				break;
			}
		}
	}
}