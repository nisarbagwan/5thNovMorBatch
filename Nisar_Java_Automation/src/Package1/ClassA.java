package Package1;

public class ClassA {

	public int w=10;
	
	private int x= 20;
	 
	protected int y= 30;
	
	int z=40;
	
	public static void main(String[] args) { // non static aslya mule aapn object create kel
	
		ClassA n=new ClassA();
	
		System.out.println(n.w);  //calling with public access specifiers = within project
		
		System.out.println(n.x);  //calling with private access specifiers = within class =cant acces fm another class
		
		System.out.println(n.y);  //calling with protected access specifiers = within package 
		
		System.out.println(n.z);   //calling with default access specifiers = within package= cant acces fm another package
	}
}
