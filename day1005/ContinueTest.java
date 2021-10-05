class ContinueTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for(int i=1;i<=10;i++){
			System.out.println(i);
			if(i%3==0){
				continue; // 3조건식 만족할때는 그이후에 오는
			}
		System.out.println("hello");		// hello를 만나지 않음
		}
		System.out.println("c");
		System.out.println("d");
	}
}
