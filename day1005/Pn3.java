
import java.util.Scanner;
class  Pn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("������ � �����Ͻǰǰ���?");
		n = sc.nextInt();

		if(n>=10){
			System.out.println((100*n)*0.9+"���Դϴ�");
			
		}
		else{
			System.out.println(100*n+"���Դϴ�");
			
		}

		   



	}
}