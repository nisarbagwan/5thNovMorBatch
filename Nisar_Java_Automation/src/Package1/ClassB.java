package Package1;

public class ClassB {
	public static void main(String[] args) {
		
		ClassA z= new ClassA();

		System.out.println(z.w);                       // public 
		System.out.println(z.y);                       // procted
		// System.out.println(z.x);                       private cant acces to another class.
		System.out.println(z.z);                       // default
}
}