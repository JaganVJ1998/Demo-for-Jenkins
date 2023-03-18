package arrayExample;

public class FirstExample {
	
	//datatype arrayname[] = new datatype[size]
	
	int arr[] = new int[5];
	
	public void arrayList()
	{
		arr[0]=12;
		arr[1]=24;
		arr[2]=36;
		arr[3]=48;
		arr[4]=60;
		//arr[5]=72; --> Index Out of Bound Exception
		
		System.out.println(arr[4]);
	}
	
	public static void main(String[] args)
	{
		FirstExample f = new FirstExample();
		f.arrayList();
	}

}
