package listExample;

public class LinkedList {
	
	public static void main(String [] args)
	{
	
		java.util.LinkedList<Object> a = new java.util.LinkedList<>();
		
		a.add(34);
		a.add("Normal");
		a.add("*");
		a.add(78.9999);
		a.add("Chennai");
		a.add(50);
		a.add("Tension");
		
		System.out.println(a);
		System.out.println();
		
		a.add(4);
		a.add(3, "Selenium");
		
		System.out.println(a);
		
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.contains("Tension"));
		System.out.println(a.getFirst());
		
		System.out.println(a.get(4));
		
		a.set(4, "&");
		System.out.println(a);
		
		
		
	}
	
	
	
	
	
	
}
