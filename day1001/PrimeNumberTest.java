//사용자 한테 어떤수 n을 입력 받아 소수인지 아닌지 판별하는 프로그램 작성

import java.util.Scanner;
class PrimeNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,cnt=0;
		System.out.print("수 n을 입력하시오");
		n = sc.nextInt();

		for(int i=1;i<=n;i++){
			if(n%i==0){
				cnt++;
			}
		}

		if(cnt ==2){
			System.out.println(n+"은 소수입니다.");
		}else{
			System.out.println(n+"은 소수가 아닙니다.");
		}
		


	}
}
