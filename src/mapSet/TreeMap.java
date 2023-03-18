package mapSet;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMap {
	
	public static void main(String[] args) {
		
		java.util.TreeMap<String, Integer> a = new java.util.TreeMap<>();
		
		a.put("English", 87);
		a.put("Tamil", 86);
		a.put("Maths", 96);
		a.put("Science", 100);
		a.put("Social Science", 98);
		a.put("Secured Mark", 467);
		a.put("Total", 500);
		
		System.out.println(a);
		
		//Enhanced For Loop
				System.out.println("Using Enhanced For Loop: ");
				Set<Entry<String, Integer>> entrySet = a.entrySet();
				for(Map.Entry<String,Integer> k :entrySet)
				{
					System.out.println(k.getKey() + " " + k.getValue());
				}
	}
	

}
