//����� ���� ��� n�� �Է� �޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class PrimeNumberTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.print("�� n�� �Է��Ͻÿ�");
		n = sc.nextInt();

		for(i =2 ;i<n; i++){ // i<=n �� ���ϴ� ������ �ڱ��ڽ����� �ȳ�������
			if(n % i == 0){
				break;
			}
		}

		//if(flag == true)
		if(i==n){
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
