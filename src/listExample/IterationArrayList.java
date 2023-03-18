package listExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationArrayList {
	
	public static void main(String[] args)
	{
		ArrayList<Object> a = new ArrayList<>();
		
		a.add(34);
		a.add("Normal");
		a.add("*");
		a.add(78.9999);
		a.add("Chennai");
		a.add(50);
		a.add("Tension");
		
		System.out.println(a);
		System.out.println();
		
		//Using normal for loop
		for(int i=0;i<a.size();i++)
		{
			System.out.println("Normal For Loop: ");
			System.out.println(a.get(i));
		}
		System.out.println();
		
		//Using Enhanced For Loop
		
		for(Object k :a)
		{
			System.out.println("Enhanced For Loop: ");
			System.out.println(k);
		}
		System.out.println();
		
		//Using Lambda expression
		System.out.println("Lambda Expressoin: ");
		a.forEach(k-> System.out.println(k));
		System.out.println();
		
		//Using Iterator
		
		System.out.println("Iterator Expressoin: ");
		Iterator<Object> iterator = a.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
