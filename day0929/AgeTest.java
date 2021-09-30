// 연습 두사람의 나이를 입력받아 서로 같은지 판별하여 적합한 메세지를 출력하는 프로그램을 작성해 봅니다.

import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("첫번째 사람의 나이를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 사람의 나이를 입력하시오");
		b = sc.nextInt();

		if(a==b)
		System.out.println("두사람의 나이는 같습니다.");
		else 
		System.out.println("두사람의 나이는 같지 않습니다.");
		

	}
}
