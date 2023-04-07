package scanner;

import java.util.Scanner;

public class MOCK {
	
	public static void main(String[] args) {
		int p,q,r;
		
		Scanner n=new Scanner (System.in);
		System.out.println("enetr three value to find gretest number");
		p=n.nextInt();
		q=n.nextInt();
		r=n.nextInt();
		
		if(p>q  && p>r) {
			System.out.println("greatest number is ="+p);
		}
		else if(q>p && q>r) {
			System.out.println("greatest number is ="+q);
		}
		else {
			System.out.println("greatest number is ="+r);
		}

	}
	
}
