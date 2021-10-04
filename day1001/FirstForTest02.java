//

class FirstForTest02
{
	public static void main(String[] args) 
	{
		int i;
		System.out.println("a");
		System.out.println("b");
		for(i=1; i<=3; i++){
			System.out.println(i);
		}
		System.out.println("c");
		System.out.println("i:"+i); //i를 for문 밖에서 정의 했기 때문에 for문 밖에서 사용가능
	}
}
