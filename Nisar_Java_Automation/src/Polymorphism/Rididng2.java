package Polymorphism;

public class Rididng2  extends Riding  {     //child extends Riding//parents {
	
	public void Statement() {
		
		System.out.println("method from sub class is running ");
	}
	public static void main(String[] args) {
		Rididng2 Y=new Rididng2();
		Y.Statement();
		
		Riding  X =new Rididng2();  // this is overloading method which use in this.
		X.Statement();
	}
	}
	
