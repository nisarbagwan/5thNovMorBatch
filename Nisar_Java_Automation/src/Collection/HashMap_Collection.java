package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Collection {

	public static void main(String[] args) {
		
		//IN hashmap we can store one null key and any number of values
		HashMap <Integer,String> map = new HashMap();
		// order of insertion Random
		map.put(11, "Automation");
		map.put(12, "manual");
		map.put(13, "sql");
		map.put(14, "java");
		int no = map.size();
		System.out.println(no);
		
		//USED ADVANCED FOR LOOP FOR PRINT
		
	for(Map.Entry<Integer, String> m : map.entrySet()) {
		System.out.println("key"+ " " + m.getKey() +  " "+"Value" + m.getValue());
	}
		
		
		
		
		
	}

}
