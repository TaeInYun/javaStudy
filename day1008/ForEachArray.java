class ForEachArray 
{
	public static void main(String[] args) 
	{
		int[]data = {1,2,3,4,5};
		for(int i:data){ //배열의 값을 하나씩 가져옴 
			System.out.println(i); // 1 2 3 4 5 이렇게 값을 하나씩 가져옴
			//System.out.println(data[i]); //2   1   2 2 2 data(1)=2 data(2)=1 data(1)=2 data(1)=2 data(1)=2 
			//for each 반복문에서 i열의 요소를 하나씩 꺼내옵니다. data[i]에 1을 넣으면 [1]인덱스로 옴
		}

		/*
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		*/
	}
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ForEachArray.main(ForEachArray.java:8)

		*/
