import java.util.Scanner;
class N3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double p;
		System.out.print("몸무게를 파운드로 입력하시오:");
		p = sc.nextDouble();
		
		System.out.println("몸무게는" +p*454+"g입니다");
	}
}
