//���� ����� ���� ���ڿ��� �Է� �޾� ���ڿ��� ���̰� 4���� �̻����� true, flase�� ����ϵ��� �غ��ϴ�.

import java.util.Scanner;
class Four
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String data;
        System.out.println("���ڿ��� �Է��Ͻÿ�");
		data = sc.next();

		boolean flag;
		flag = data.length() >=4;
		System.out.println(flag);

	}

}