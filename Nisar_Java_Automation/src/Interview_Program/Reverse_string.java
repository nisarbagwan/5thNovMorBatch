package Interview_Program;

import java.util.Scanner;

public class Reverse_string {
public static void main (String [] args) {
	
	String a= "Bagwan Nisar";
	String reverse = "";
	
	for (int i=a.length()-1;i>=0;i--) {
		reverse=reverse+a.charAt(i);
	 // System.out.println(a.length());
    // System.out.println(a.length()-1);
		}
	System.out.println(reverse);
	
	
	
}
}
