import java.util.Scanner;
class SajuPalja
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []result = {"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��",
		"õ��","õ��","õ��"};
		
		String name;
		int year;
		int month;
		int date;
		int time;

		System.out.print("�̸��� �Է��Ͻÿ� ==>");
		name = sc.next();
		System.out.print("�츦 �Է��ϼ���");
		System.out.print("0:���,1:��,2:��,3:�䳢,4:��,5:��,6:��,7:��,8:������,9:��,10��,11:����===>"); //�Ҷ� 1
		year = sc.nextInt(); //1 �Ҷ� õ��
		System.out.print("������ �Է��ϼ���==>");
		month = sc.nextInt(); // 3 õ��
		System.out.print("������ �Է��ϼ���==>");
		date = sc.nextInt(); //20 õ��
		System.out.print("���ø� �Է��ϼ���");
		System.out.print("0:��,1:��,2:��,3:��,4:��,5:��,6:��,7:��,8:��,9:��,10:��,11:��==>");
		time = sc.nextInt(); // 8 (�Ž� ��3��-5��) õ��

		int n =year; //1 õ��
		System.out.println("***" +name + "���� �������� Ǯ��*** ");
		System.out.println("������ �����" + result[n]);  //1 õ��

		n = (n + month - 1)%12; //(1 + 3 -1)%12 = 3
		System.out.println("������ �����"+ result[n]); //3 õ��

		n = (n + date -1)%12;  //(3 + 20 -1)%12 = 22%12 = 10
		System.out.println("������ �����"+ result[n]); //10 õ��

		n = (n + time) % 12; //(10 + 8) %12 ==6  -1���ϴ� ������ 0�� �ڽ÷� �ؼ� 
		System.out.println("������ �����"+ result[n]); //6 õ��


	}
}
