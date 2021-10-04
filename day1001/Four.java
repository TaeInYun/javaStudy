//사용자 한테 어떤n을 입력받아n의 약수를 모두 출력하는 프로그램을 작성해봅니다.

import java.util.Scanner;
class Four
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N을 입력하시오");
		n = sc.nextInt();
		System.out.println(n+"의 약수는 다음과 같습니다.");

		// 약수는 그수로 나누면 나머지 0	

		//for(int i=n ; i>=1 ; i--)
		for(int i =1 ; i<=n ; i++ ){
			if(n%i==0){
				System.out.print(i + " ");
			}
			}
		}




	}
