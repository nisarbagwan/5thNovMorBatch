package Polymorphism;

public class Overloading {   //method with arguments //method is non static

	public void addition(int a,int b) {
		System.out.println(a+b);
	} 
	public void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	} 
	public void STRING(String name,String surname) {
		name= "nisar";
		surname= " bagwan";
	
	} 
	
	 public static void substraction(int e,int f) 
	 { System.out.println(e-f); 
	 }
	 
	public static void main(String[] args) {
		
		Overloading z=new Overloading();
		z.addition(20, 30);
		z.addition(10, 20, 30);
		z.substraction(80, 30);
		 
		Overloading k=new Overloading();
		k.STRING("nisar", "bagwan");
}
}