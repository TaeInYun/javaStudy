//���� ����� ���� ���ڿ��� �Է¹޾� �� ù��° ���ڸ� ��� �� ���ϴ�.

import java.util.Scanner;
class  Q1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.println("�ܾ �Է��ϼ���");
		word = sc.next();

	    //char fisrt;
		//first = word charAt(0);
		char first = word.charAt(0);
		System.out.println("ù��°�� �ִ� ���ڴ� "+first+" �Դϴ�.");
        //System.out.println("ù��°�� �ִ� ���ڴ� "+word.charAt(0)+" �Դϴ�.");

		//String first =word.charAt(0)+"";
		//String first = word.substring(0,1);  // �������� �� �� substring Ȱ���ϸ� 2���̻� ����
		//System.out.println("ù��°�� �ִ� ���ڴ� "+first+" �Դϴ�.");

	}
}

//����, string���� �����ϰ� �;��!