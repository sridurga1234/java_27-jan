class TestReturnArray
{
	//creating method which returns an array
	static int[] get()
	{
		return new int[]{10,20,26,87,12};
	}
	public static void main(String args[])
	{
		//calling method which returns an array 
		int arr[]=get();
		//printing the values of an array
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}