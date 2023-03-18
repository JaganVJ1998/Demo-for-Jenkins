package listExample;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		ArrayList<Object> object = new ArrayList<>();
		
		object.add(34);
		object.add("Selenium");
		object.add(null);
		object.add("done");
		object.add(false);
		object.add(12.5);
		object.add("&");
		
		System.out.println(object);
		System.out.println(object.contains("done"));
		System.out.println(object.get(3));
		System.out.println(object.remove(2));
		System.out.println(object);
		
		System.out.println(object.indexOf(12.5));
		System.out.println(object.isEmpty());
		System.out.println(object.lastIndexOf("done"));
		
		object.add(4, "Camel");
		System.out.println(object);
		
		object.set(6, "*");
		System.out.println(object);
		
		System.out.println(object.size());
		
//		object.clear();
		System.out.println(object);
		
		System.out.println();
		System.out.println();
		
		ArrayList<Object> move = new ArrayList<>();
		
		move.addAll(object);
		System.out.println(move);
		
		move.removeAll(object);
		System.out.println(move);
		
		
		
		
		
		
		
		
	}

}
