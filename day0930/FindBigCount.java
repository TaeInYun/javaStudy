// 사용자한테 세개의 수를 입력받아 그중에 가장 큰수를 찾아 출력하는 프로그램 작성

import java.util.Scanner;
class FindBigCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int a,b,c ;
		int a,b,c,max;
		System.out.print("첫번째수를 입력하시오");
		a = sc.nextInt();
		System.out.print("두번째수 를 입력하시오");
		b = sc.nextInt();
		System.out.print("세번째 를 입력하시오");
		c = sc.nextInt();

		if(a>b){    
			if(a>c) {  // 중첩선택문
				max = a;
			}else{     // 중첩선택문에서는 else가 오면 나랑 가장 가까운 if와 대응함
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
		}
		

		System.out.println("가장큰수는 "+ max+ "입니다.");

		/*if(a>b && a>c){
			System.out.print("큰수" +a);
		}
		else if (b>a && b>c){   
			System.out.print("큰수" +b);
		}
		else if (c>b && c>a){   
			System.out.print("큰수" +c);
		}
		*/




	}
}
