package setExample;

import java.util.Iterator;

public class LinkedHashSet {
	
	public static void main(String [] args)
	{
		java.util.LinkedHashSet<Object> a = new java.util.LinkedHashSet<>();
		
		a.add(89);
		a.add("Selenium");
		a.add("&");
		a.add("&");
		a.add(67.0);
		a.add("Null");
		a.add(null);
		a.add(false);
		a.add("Null");
		
		System.out.println(a);
		System.out.println();
		
		//Using For Loop
				System.out.println("Using Normal For Loop: ");
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a);
				}
				System.out.println();
				
				//Using Enhanced For loop
				System.out.println("Using Enhanced For Loop: ");
				for(Object k: a)
				{
					System.out.println(k);
				}
				System.out.println();
				
				//Lambda Expression
				System.out.println("Using Lambda Expression: ");
				a.forEach(k-> System.out.println(k));
				System.out.println();
				
				//Iteration
				System.out.println("Using Iteration: ");
				Iterator<Object> i= a.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				System.out.println();
	}

}
