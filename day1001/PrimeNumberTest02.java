//����� ���� ��� n�� �Է� �޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class PrimeNumberTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true;
		System.out.print("�� n�� �Է��Ͻÿ�");
		n = sc.nextInt();

		for(int i =2 ;i<=n; i++){
			if(n%i==0){
				flag = false;
			}
		}

		if(flag == true){
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}