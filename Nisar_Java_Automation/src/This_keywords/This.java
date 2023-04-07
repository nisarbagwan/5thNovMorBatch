package This_keywords;

public class This {    // keyword
 int i=75;  //global world
	
 public  void test() {
	int  i=58;    //local variable
	
	 System.out.println(i);       //local variable
	 
	System.out.println(this.i);     //gloabl variable
		
	 }
 public  void basic ( ) {
	 
	 int a=30;
	 
	 System.out.println(a);        //local variable
	 System.out.println(this.i);  //global variable
 }
 public static void main(String[] args) {
	This k = new This();
	k.test();
     k.basic();
}
 }

