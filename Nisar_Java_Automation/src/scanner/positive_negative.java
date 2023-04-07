package scanner;


import java.util.Scanner;

public class positive_negative {

	public static void main (String[] args) {
		Scanner k=  new Scanner (System.in);
		int num;
		System.out.println("ENETR NUMBER IS:-");
		 num=k.nextInt();
		if (num <=-1){
		System.out.println("ENETR NUMBER negative");}
		else{
		System.out.println("ENETR NUMBER positive");}
		}
}