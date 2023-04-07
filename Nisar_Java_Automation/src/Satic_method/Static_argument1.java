
package Satic_method;

public class Static_argument1 
{
	public void multiplaction (int j,int k) {
		int z=j*k;
		System.out.println("multiplacation will be " +z);
	}
	
       public static void addition (int a,int b) 
	{
	int c =a+b;
	int d =a*b;
	int e =a-b;
	
	System.out.println("addition will be " +c);
	
	System.out.println("multiply will be " +d);
	
	System.out.println("subtraction will be " +e);
		
	        }
	public static void main(String[] args) 
	{
		Static_argument1 n=new Static_argument1();
		n.multiplaction(10, 20);
		addition(60,40);
		
	}
}
