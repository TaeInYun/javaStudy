//연습 사용자한테 n을 입력 받아 n!를 구하여 다음과 같이 출력하는 프로그램을 for문을 이용하여 작성

import java.util.Scanner;
class Fac
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=1;	//sum만 초기화
		System.out.print("정수N을 입력하시오==>");
		n = sc.nextInt();
		//i:1,2,3,4,5
		//i:5,4,3,2,1
		for(int i=n; i>=1; i--){
			sum*=i;  //sum *i
			System.out.print(i);
			if(i!=1){
				System.out.print("*");
			}
		}

		System.out.println("="+sum+"입니다.");

	}
}
