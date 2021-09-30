//연습 사용자에게 n입력 바아서 그수가 6의 배수인지 판별하여 논리값 출력 프로그램

import java.util.Scanner;
class MultipleTest6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		boolean flag;
		System.out.println("n의 값을 입력하시오");
		n = sc.nextInt();

		//mode = n%6;

		flag = n%6 == 0;

		System.out.println(flag);


	}
}
