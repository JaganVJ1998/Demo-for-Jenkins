package setExample;

import java.util.Iterator;

public class TreeSet {
	
	public static void main(String [] args)
	{
		java.util.TreeSet<Integer> a = new java.util.TreeSet<>();
		
		a.add(56);
		a.add(89);
		a.add(67);
		a.add(12);
		System.out.println(a);
		
		java.util.TreeSet<String> a1 = new java.util.TreeSet<>();
		
		a1.add("Selenium");
		a1.add("Ruby");
		a1.add("Pearl");
		a1.add("Cypress");
	
		System.out.println(a1);
		
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
				Iterator<Integer> i= a.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				System.out.println();
		
	}

}
