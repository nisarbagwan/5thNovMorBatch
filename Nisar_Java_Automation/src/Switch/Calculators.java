package Switch;

import java.util.Scanner;

public class Calculators {
	public static void main(String[] args) 
    {
	System.out.println("Enter two Interger Number");
	Scanner s=new Scanner (System.in);
	int nub1,nub2,nub3;
	
	
	nub1=s.nextInt();
	nub2=s.nextInt();
	
	System.out.println("Enter 1 for addotion");     //
	System.out.println("Enter 2 for sub");
	System.out.println("Enter 3 for mul");
	System.out.println("Enter 4 for div");
	
	nub3=s.nextInt();
	
      {
		switch (nub3) 
		 {

		case 1:
			System.out.println("The add is "+(nub1+nub2));
			break;
		case 2:
			System.out.println("The sub is "+(nub1-nub2));
			break;
		case 3:
			System.out.println("The mul is "+(nub1*nub2));
			break;
		case 4:
			System.out.println("The div is "+(nub1/nub2));
			break;
		default:
			System.out.println("Enter value is Invalid");
		
		 }		
      }
    }
   }