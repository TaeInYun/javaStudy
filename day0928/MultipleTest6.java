//���� ����ڿ��� n�Է� �پƼ� �׼��� 6�� ������� �Ǻ��Ͽ� ���� ��� ���α׷�

import java.util.Scanner;
class MultipleTest6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		boolean flag;
		System.out.println("n�� ���� �Է��Ͻÿ�");
		n = sc.nextInt();

		//mode = n%6;

		flag = n%6 == 0;

		System.out.println(flag);


	}
}
