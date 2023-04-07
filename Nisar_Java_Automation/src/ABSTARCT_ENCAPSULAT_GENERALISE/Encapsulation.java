package ABSTARCT_ENCAPSULAT_GENERALISE;

public class Encapsulation {

	private int a=60;             // declare data members (variable) as private
	private int b=50;
	
	Encapsulation () {
		a=50;
		b=50;
	}
  Encapsulation (int c,int d) {
		a=c;
		b=d;
	}
	public void demo() {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Encapsulation zy= new Encapsulation ();
               zy.demo();
	}
}
