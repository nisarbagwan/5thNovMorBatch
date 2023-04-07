package Polymorphism;

public class Test_Method_Hide {
	public static void Demo () {
		System.out.println("Sub class demo method is running");
	}
public static void main(String[] args) {
	Test_Method_Hide v= new Test_Method_Hide ();
	v.Demo();
}
}
