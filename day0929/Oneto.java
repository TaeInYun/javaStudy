import java.util.Scanner;
class Oneto
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		int i=1;

		
		System.out.println("1부터 어떤수까지 더할까요?");
		n = sc.nextInt();
		
		 for(i=1 ; i<=n;i++){
		   sum +=i;
		}
		
	
		System.out.println("1부터"+n+"까지의합은"+sum);

	}
}
