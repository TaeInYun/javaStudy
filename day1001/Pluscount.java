import java.util.Scanner;
class Pluscount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;  //i는 사용자로 부터 입력 받기 때문에 꼭초기화 않아도 되지만
		              //sum은 연산을 해야 때문에 초기값을 설정해야 한다.
					  //지금은 더하기를 할 것이라서 0으로 초기화 했습니다.
					  //주어진 문제해결을 위하여 그때 그때마다 적합한 값으로 초기화 해야 합니다.
		System.out.print("1부터 어떤수까지 더하기 할까요?");
		n= sc.nextInt();
		for(int i=1; i<=n;i++ ){
			sum+=i;
		}
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
		
		
		
	}
}
