// ���� �λ���� ���̸� �Է¹޾� ���� ������ �Ǻ��Ͽ� ������ �޼����� ����ϴ� ���α׷��� �ۼ��� ���ϴ�.

import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("ù��° ����� ���̸� �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("�ι�° ����� ���̸� �Է��Ͻÿ�");
		b = sc.nextInt();

		if(a==b)
		System.out.println("�λ���� ���̴� �����ϴ�.");
		else 
		System.out.println("�λ���� ���̴� ���� �ʽ��ϴ�.");
		

	}
}
