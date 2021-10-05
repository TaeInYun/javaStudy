
import java.util.Scanner;
class  Pn2
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   char type;
	   //String P;
	   //char R,T,C;
	   double width, high;
	  double result =0;
		System.out.println("도형의 종류를 입력하세요 R:사각형,T:삼각형,C:원");
		type =sc.next().charAt(0);


			if(type == 'R'){
				System.out.println("사각형의 가로를 입력하시오.");
				width = sc.nextDouble();
				System.out.println("사각형의 세로를 입력하시오.");
				high = sc.nextDouble();
				result = (double)width*high;
				 System.out.print("사각형의");
			}


			else if(type == 'T'){
				System.out.println("삼각형의 가로를 입력하시오.");
				width = sc.nextDouble();
				System.out.println("삼각형의 세로를 입력하시오.");
				high = sc.nextDouble();
				result = (double)width*high/2;
				System.out.print("삼각형의");
			}


			else if(type == 'C'){
				System.out.println("원의 반지름을 입력하시오.");
				width = sc.nextDouble();
				result = (double)width*width*3.14; // radius 라는 변수를 새로 써도 됨
				System.out.print("원의");
			}
			else{
				System.out.println("잘못 입력했습니다.");
				return; //여기에서 main메소드를 종료 합니다 뒤에꺼 출력 안함
			}


	    System.out.print("면적은" + result + "입니다");



	}
}
