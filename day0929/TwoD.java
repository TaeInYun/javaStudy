/* int a = 5; 
// int b =(a>0)?100:0;
//System.out.println(b);
사용자한테 두개의 정수를 입력받아 그중에 작은수를 찾아 출력하는 프로그램을 
*/


import java.util.Scanner;
class TwoD
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.println("첫번째정수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째정수를 입력하시오");
		b = sc.nextInt();
		min=(a<b)?a:b;

		System.out.println("작은수는" +min+"입니다.");

	}
}
