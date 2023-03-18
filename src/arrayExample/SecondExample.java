package arrayExample;

public class SecondExample {
	
	int arr[] = {23,45,67,45,78,97,123,99};
	public void singleArray()
	{
		System.out.println(arr[2]);
		System.out.println();
		
		System.out.println("Using Normal For Loop: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("Using Enhanced For Loop: ");
		
		for(int k: arr)
		{
			System.out.println(k);
		}
		System.out.println();
		
		System.out.println("Array Reverse: ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
			
			
			
			
			
			
			
			
		
	}
	
	public static void main(String[] args)
	{
		SecondExample s = new SecondExample();
		s.singleArray();
	}

}
