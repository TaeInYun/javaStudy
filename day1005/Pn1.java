//간단한 계산기

import java.util.Scanner;
class Pn1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char sign;
		//String sign;
		//String +, -, *, /
		int n1,n2;
		//int n1=0, n2=0;

		System.out.print("연산자를 입력하시오");
		sign = sc.next().charAt(0); //+ 로 입력하면 char 0번째 변수로 입력

		System.out.print("첫번재 숫자를 입력하시오");
		n1 = sc.nextInt();

		System.out.print("두번째 숫자를 입력하시오");
		n2 = sc.nextInt();


		if(sign == '+' ){
			System.out.println(n1+ "+"+n2+"="+(n1+n2));
		}
		   else if(sign == '-' ){
			System.out.println(n1+ "-"+n2+"="+(n1-n2));
		}
		else if(sign == '*' ){
			System.out.println(n1+ "*"+n2+"="+(n1*n2));
		}
		else if(sign == '/' ){
			if(n2 == 0){
			 System.out.println("분모는 0이 올수 없습니다.");
			}else{
			 System.out.println(n1+ "/"+n2+"="+(n1/n2));
			}
		}
		else{
			 System.out.println("잘못된 연산자");
		}




	}
}
