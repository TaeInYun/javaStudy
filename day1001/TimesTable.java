
import java.util.Scanner;
class TimesTable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("몇단을 출력할까요");
		n=sc.nextInt();

		for(int i=1;i<=9;i++){
			System.out.println(n+"*"+i+"="+(n*i));
		
		}
	}
}
