//연습 사용자 한테 문자열을 입력 받아 문자열의 길이가 4글자 이상인지 true, flase를 출력하도록 해봅니다.

import java.util.Scanner;
class Four
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String data;
        System.out.println("문자열을 입력하시오");
		data = sc.next();

		boolean flag;
		flag = data.length() >=4;
		System.out.println(flag);

	}

}