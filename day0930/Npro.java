//사용자한테 임의의 수 n을 입력받아 n이 양수 이면 그수에 100을 더한 값을 출력한 다음 "작업종료"를 출력하고
//그렇지 않으면 그 수의 제곱을 출력한 다음 작업종ㄽ를 출력하도록 프로그램을 작성해 봅시다.

import java.util.Scanner;
class Npro

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("임의의 수 n을 입력하시오:");
		n = sc.nextInt();

		if(n>=0){
			System.out.println(n+100);
		}
		else{
			System.out.println(n*n);
		}
		System.out.println("작업종료");
		
		
	}
}
