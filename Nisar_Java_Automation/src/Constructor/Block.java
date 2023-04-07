package Constructor;

public class Block {

	static {
		System.out.println("static block is running"); // jya block chya pudhey static lagto tyala static block called
														// krtart
														
	}

	{
		System.out.println("non-static block is running"); // jya block chya pudhey static lagt nhi tyala non static
															// block called krtart
															
	}

	public static void main(String[] args) {

		Block n = new Block();

		System.out.println("main method is running");
	}
}


//nehmi aapn jevha pn whenever main method call krto tevha nehmi static call agodr hoto n then no  static call hoto 