import java.util.Scanner;
class Pn11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("정수n을 입력하시오");
		n = sc.nextInt();

		if (n<0){
		System.out.print("잘못 입력했습니다.");
		}
		else
			for(int i=1;i<=n;i++){
				if(i%3 ==0){
					System.out.print(i+" ");
				}
			}
	}
}
