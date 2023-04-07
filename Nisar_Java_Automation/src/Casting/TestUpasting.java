package Casting;

public class TestUpasting {
public static void main(String[] args) {
	System.out.println("*****Super class method*****");
	
	Upcasting x= new Upcasting();
	x.Demo();
	x.Test();
	x.superclass();
	
	System.out.println("*****Sub class method*****");
	
	Upcast1 y= new Upcast1();
	y.Demo();
	y.Test();
	y.Subclass();
	y.superclass();
	
	Upcasting z=new Upcast1();  //super class to sub class variable
	
	System.out.println("*****class method*****");
	z.Demo();
	z.Test();
	z.superclass();
	
	Upcast1 up= (Upcast1) new Upcasting();
	
	up.Demo();
	up.Test();
	up.Subclass();
	up.superclass();
	
	
}
}
