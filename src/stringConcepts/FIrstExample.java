package stringConcepts;

public class FIrstExample {
	
	public static void main(String[] args)
	{
		String s = "Alice in ";
		String s1 = "Chennai Super Kings";
		String s2 = new String("Madras");
		String s3 = "Plot No: 246, Thiruvalluvar Nagar, Tirur Post, Thiruvallur District - 602025";
		String s4 = "          hi, Welcome        ";
		
		//CharAT
		System.out.println("CharAt: " + s.charAt(4));
		System.out.println();
		
		//Compare
		System.out.println("Compare: " + s.compareTo("Count"));
		System.out.println();
		
		//Concat
		System.out.println("Concat: " + s.concat(" the wonderland"));
		System.out.println();
		
		//Contains
		System.out.println("Contains: " + s.contains("r"));
		System.out.println();
		
		//IndexOf
		System.out.println("IndexOf: " + s.indexOf("A"));
		System.out.println();
		
		//HashCode
		System.out.println("First HashCode: " + s.hashCode());
		System.out.println("Second HashCode: " + s1.hashCode());
		System.out.println("Third HashCode: " + s2.hashCode());
		System.out.println("Fourth HashCode: "  + s3.hashCode());
		System.out.println();
		
		//SubString
		System.out.println("SubString: "  + s3.substring(4));
		System.out.println();
		
		System.out.println("SubString FirstIndex and LastIndex: "  + s3.substring(1, s3.length()-1));
		System.out.println();
		
		//UpperCase
		System.out.println("UpperCase: "  + s1.toUpperCase());
		System.out.println();
		
		//LowerCase
		System.out.println("LowerCase: "  + s1.toLowerCase());
		System.out.println();
		
		//Length
		System.out.println("Length: "  + s1.length());
		System.out.println();
		
		//EndsWith
		System.out.println("EndsWith: "  + s1.endsWith("Kings"));
		System.out.println();
		
		//StartsWith
		System.out.println("StartsWith: "  + s1.startsWith("Chennai"));
		System.out.println();
		
		//IsEmpty
		System.out.println("Is Empty: " + s1.isEmpty());
		System.out.println();
		
		//Replace
		System.out.println("Replace: " + s2.replace("a", "e"));
		System.out.println();

		//trim
		System.out.println("Trim: " + s4.trim());
		System.out.println();
		
		//Replace All
		System.out.println("Replace All: " + s3.replaceAll("[a-zA-Z ]", ""));
		
		System.out.println("Replace All: " + s3.replaceAll("[^a-zA-Z ]", ""));
		System.out.println();
		
		//ToCharArray
		
		char[] charArray = s2.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println("CharArray: " + charArray[i]);
		}
		System.out.println();
		
		//Split
		String[] split = s1.split(" ");
		for(String a: split)
		{
			System.out.println(a);
		}
		System.out.println();
		
		for(int i=0;i<split.length;i++)
		{
			System.out.println("Split: " + split[i]);
		}
	}
}
