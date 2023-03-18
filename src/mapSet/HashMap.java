package mapSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<String, Integer> a = new java.util.HashMap<>();
		
		a.put("English", 87);
		a.put("Tamil", 86);
		a.put("Maths", 96);
		a.put("Science", 100);
		a.put("Social Science", 98);
		a.put("Secured Mark", 467);
		a.put("Total", 500);
		a.put(null, 78);
		a.put(null, 67);
		a.put("Physics", null);
		a.put("Total", 500);
		a.put("Civis" , null);
		
		
		System.out.println(a);
		System.out.println();
		
		
		//Iterating using Enhanced loop
		System.out.println("Enhanced For Loop: ");
		Set<Entry<String, Integer>> entrySet = a.entrySet();
		for(Map.Entry<String, Integer> k:entrySet)
		{
			System.out.println(k.getKey() + " " + k.getValue());
			
		}
		System.out.println();
		
		
	}
}
