package Array;

public class Basic {

	public static void main(String[] args) {

		int a [] = {10,20,30,40,50,60,70,80,90};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);

		String b [] = new String [7];
		
		b [0]="prajwal";
		b [1]="nisar";
		b [2]="sushma";
		b [3]="rajat";
		b [4]="siraj";
		b [5]="sagar";
		b [6]="rahul";
		
		//System.out.println(b[1]);
	
		for ( int i = 0; i<=6;i++) {
			System.out.println(b[i]);
			}
		System.out.println("****des*****");
		for (int i=6;i>=0;i--) {
			
			System.out.println(b[i]);
		}
	}
}

