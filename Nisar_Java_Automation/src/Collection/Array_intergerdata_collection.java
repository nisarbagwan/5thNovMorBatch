package Collection;

import java.util.ArrayList;

public class Array_intergerdata_collection {

	public static void main(String[] args) {
		
		//ArrayList <Integer>list = new <Integer> ArrayList ();  // array accept only "integer"
		//ArrayList <String>list = new <String> ArrayList ();      // array accept only "String"
		ArrayList <Float>list = new <Float> ArrayList ();      // array accept only "String"
		
		//list.add(123);     //array take only integer data type only
		//list.add("automation"); 
		list.add(23.85f);
		//list.add("@");
		
		int nu = list.size();
		System.out.println(nu);  //size find out keli
		
		for (int i =0;i <list.size();i++) {
			System.out.println(list.get(i));  // text get kraych so list.get method use keli
		}
		
		System.out.println("before removed index");
		System.out.println("*************");
		System.out.println("after removed index");
		
//		list.remove(2);
//		
//		for (int i =0;i <list.size();i++) {
//			System.out.println(list.get(i));  //insertation madhe ek index delete keli text get kraych so list.get method use keli
//		}
	}


	}


