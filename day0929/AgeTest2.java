//연습 두사람의 나이를 입력받아 두사람모두 20살 이상인지 판별하여 적합한 메세지를 출력하는 프로그램 작성 비트연산자를 논리연산자로이용 

import java.util.Scanner;
class BitLogical02

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1, age2;
		System.out.println("첫번째 사람의 나이를 입력하시오");
		age1 = sc.nextInt();
		System.out.println("두번째 사람의 나이를 입력하시오");
		age2 = sc.nextInt();

		if(age1>=20 & age2>=20)
			System.out.println("두사람의 나이는 모두20살 이상입니다.");
		else
			System.out.println("두사람의 나이는 모두20살 이상이 아닙니다.");

	}
}
