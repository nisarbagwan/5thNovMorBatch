package Polymorphism;

public class Overloading_nonstatic {

	public static void addition(int a,int b) {
		System.out.println(a+b);
	} 
	public  static void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	} 
	public static void main(String[] args) {
		Overloading_nonstatic.addition(20, 30);
		Overloading_nonstatic.addition(10, 20, 30);
	}
}


// in static method we don't create object