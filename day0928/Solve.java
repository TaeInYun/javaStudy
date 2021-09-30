//사용자한테 두개의 정수를 입력 받아 사칙연산을 수행한 결과를 다음과 같이 출력하는 프로그램을 작성

import java.util.Scanner;
class Solve
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,add,sub,multi,div,mode ;
		System.out.print("첫 번째 수를 입력하시오 ==>"); // ln 은 라인내리는거 빼면 라인 안내림 
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하시오==>");
		b = sc.nextInt();

		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mode = a%b;
		
        System.out.println("*** 오칙 연산 결과 ***");
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);
		

	}
}
