//사용자 한테 어떤수 n을 입력 받아 소수인지 아닌지 판별하는 프로그램 작성

import java.util.Scanner;
class PrimeNumberTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true;
		System.out.print("수 n을 입력하시오");
		n = sc.nextInt();

		for(int i =2 ;i<n; i++){ // i<=n 로 안하는 이유는 자기자신으로 안나눌려고
			if(n % i == 0){
				flag = false; //100/2=0 이것만 되면 다시 나누어도됨
				break;
			}
		}

		//if(flag == true)
		if(flag){
			System.out.println(n+"는 소수입니다.");
		}else{
			System.out.println(n+"는 소수가 아닙니다.");
		}
	}
}
