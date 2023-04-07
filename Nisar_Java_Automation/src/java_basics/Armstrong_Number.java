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
  System.out.println ("given number is armstrong number");
  }
  else {
  System.out.println("given number is not armstrong number");
}
}
}