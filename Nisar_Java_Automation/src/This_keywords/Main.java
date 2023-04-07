package This_keywords;

class Main {
 int i=6;

	
	 public Main () {
	 
	 System.out.println(i); }
	 
 
	  public Main (int i) { 
		  this.i=i; 
	  System.out.println(i); }
	 
	public static void main(String[] args) {
		
	Main obj = new Main();
	//obj.i=10;
	
    System.out.println("value i="+obj.i);
    Main obj2 = new Main(5);
    System.out.println("value i="+obj2.i);
    
    System.out.println("value i="+obj.i);
	}
	
}
