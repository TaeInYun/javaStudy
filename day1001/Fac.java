//���� ��������� n�� �Է� �޾� n!�� ���Ͽ� ������ ���� ����ϴ� ���α׷��� for���� �̿��Ͽ� �ۼ�

import java.util.Scanner;
class Fac
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=1;	//sum�� �ʱ�ȭ
		System.out.print("����N�� �Է��Ͻÿ�==>");
		n = sc.nextInt();
		//i:1,2,3,4,5
		//i:5,4,3,2,1
		for(int i=n; i>=1; i--){
			sum*=i;  //sum *i
			System.out.print(i);
			if(i!=1){
				System.out.print("*");
			}
		}

		System.out.println("="+sum+"�Դϴ�.");

	}
}
