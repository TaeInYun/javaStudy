//��������� ������ �� n�� �Է¹޾� n�� ��� �̸� �׼��� 100�� ���� ���� ����� ���� "�۾�����"�� ����ϰ�
//�׷��� ������ �� ���� ������ ����� ���� �۾������� ����ϵ��� ���α׷��� �ۼ��� ���ô�.

import java.util.Scanner;
class Npro

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("������ �� n�� �Է��Ͻÿ�:");
		n = sc.nextInt();

		if(n>=0){
			System.out.println(n+100);
		}
		else{
			System.out.println(n*n);
		}
		System.out.println("�۾�����");
		
		
	}
}