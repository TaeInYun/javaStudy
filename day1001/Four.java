//����� ���� �n�� �Է¹޾�n�� ����� ��� ����ϴ� ���α׷��� �ۼ��غ��ϴ�.

import java.util.Scanner;
class Four
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N�� �Է��Ͻÿ�");
		n = sc.nextInt();
		System.out.println(n+"�� ����� ������ �����ϴ�.");

		// ����� �׼��� ������ ������ 0	

		//for(int i=n ; i>=1 ; i--)
		for(int i =1 ; i<=n ; i++ ){
			if(n%i==0){
				System.out.print(i + " ");
			}
			}
		}




	}
