
import java.util.Scanner;
class  Pn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("물건을 몇개 구입하실건가요?");
		n = sc.nextInt();

		if(n>=10){
			System.out.println((100*n)*0.9+"원입니다");
			
		}
		else{
			System.out.println(100*n+"원입니다");
			
		}

		   



	}
}
