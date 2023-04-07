package Collection;

import java.util.ArrayList;

public class Simple_Array_Collection {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList ();

		list.add(123);
		list.add("automation");
		list.add(23.85f);
		list.add('@');
		
		int nu = list.size();
		System.out.println(nu);  //size find out keli
		
		for (int i =0;i <list.size();i++) {
			System.out.println(list.get(i));  // text get kraych so list.get method use keli
		}
		
		System.out.println("before removed index");
		System.out.println("*************");
		System.out.println("after removed index");
		
		list.remove(2);
		
		for (int i =0;i <list.size();i++) {
			System.out.println(list.get(i));  //insertation madhe ek index delete keli text get kraych so list.get method use keli
		}
	}

}
