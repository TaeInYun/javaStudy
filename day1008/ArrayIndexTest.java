class ArrayIndexTest 
{
	public static void main(String[] args) 
	{
		int []arr = new int[5];
		//0,1,2,3,4
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);			
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println(arr[5]);
	}
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayIndexTest.main(ArrayIndexTest.java:14) 5라는 인덱스는 사용할수 없다
		*/
