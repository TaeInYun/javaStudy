//���� �л��� �̸�,�������� �Է¹޾� ������ ����� ���Ͽ� ����ѵ� ����� 60�̻��̸� �հ� �׷��� ������ ���հ� ���



import java.util.Scanner;
class Test3
 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.println("�л��� �̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("���������� �Է��ϼ���");
		kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		math = sc.nextInt();

		tot = kor+eng+math;
		avg = (double)tot/3;

		System.out.println("������"+tot+"�Դϴ�.");
		System.out.println("�����"+avg+"�Դϴ�.");

		if (avg >= 60 )
		System.out.println("�հ�");
		else
		System.out.println("���հ�");


	}
}
