// 연습 사용자 한테 두개의 정수를 입력 받아 그중에 작은수를 찾아 출력

import java.util.Scanner;
class SmallTest
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("정수를 입력하시오");
		a = sc.nextInt();
		System.out.println("정수를 입력하시오");
		b = sc.nextInt();

		if(a<b)
		System.out.println("작은 수는 " + a + "입니다.");
		else if (a==b)
		System.out.println("두수는 같습니다.");
		else
		System.out.println("작은수는 " + b + "입니다.");




	}
}
