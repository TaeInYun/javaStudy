import java.util.Random; //랜덤 설정해야함
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n =rand.nextInt();
		System.out.println(n);

		// 0에서 9사이
		n=n>>>1; // 난수 무조건 양수 >>>
		n=n%10;
		System.out.println(n);
		//System.out.println(n%10);

	}
}
