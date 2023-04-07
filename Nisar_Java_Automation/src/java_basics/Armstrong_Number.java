package java_basics;

import java.util.Scanner;

public class Armstrong_Number { 

public static void main (String [] args) {
   
   int number=153;
    int add=0;
  

   for (int i=number;i >0;i=i/10) {
   int reaminder= 1%10 ;
    add=add+(reaminder*reaminder*reaminder);
}
   if (number==add) {
  System.out.println ("Given number is Armstrong number");
  }
  else {
  System.out.println("Given number is not Armstrong number");
}
}
}