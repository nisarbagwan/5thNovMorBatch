package Array;

import java.util.Arrays;

public class Swap_asc_des {
	public static void main(String[] args) {
		
		  int b []= {11,22,33,44,55,66};
		   int size =b.length-1;
		  System.out.println(size); 
		  for(int i=0;i<b.length-1;i++) {
		  System.out.println(b[i]); }
		 
		  System.out.println("******");
	int c []= {10,9,15,13,12,18,2};
	Arrays.sort(c);
	
	  for (int i =0;i<=c.length-1;i++) 
	  { System.out.println(c[i]); }
	  System.out.println("******");
	for (int i =c.length-1;i>=0;i--) {
		System.out.println(c[i]);
	}
	}
	}



