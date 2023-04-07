package Constructor;

public class Basic
{
     
	int a;
	int b;
	int c;
	String name;
	String velocity;

	
	Basic ()        //user defined constructor without parameter
	{
	a=50;
	b=50;
	}
	Basic ( int n,int p)  //user defined constructor without parameter
	{
	a=n;
	b=p;
     }
	Basic ( int n,int p,int s)  //user defined constructor without parameter
	{
	a=n;
	b=p;
	c=s;
     }
	Basic ( String nisar,String katraj) //user defined constructor without parameter
	{
	 name = nisar;
	 velocity = katraj;
		
     }
	
	public void addition () {                 //non static method
		System.out.println(a+b+c);
		}
	public void test() {                     //non static method
		System.out.println(name);
		System.out.println(velocity);
	}
	public static void main(String[] args) {
		
		
		  Basic x =new Basic ();
		  x.addition();
		  x.test();
          System.out.println(x.a);
		  System.out.println(x.b);
		
		 
		Basic y =new Basic (30,40);
		y.addition();
		
		Basic z =new Basic (10,20,30);
		z.addition();
		
		Basic k =new Basic ("nisar","katraj");
		k.test();
	}
	
}	
	

