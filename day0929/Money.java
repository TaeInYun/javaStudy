//���� �л��� �̸�,����,����,������ �Է¹޾� ���������� 90���̻��̰� ��������� 90���̻��̸� ���б��� �����Ϸ��� �մϴ�.
//���б� ���޿��θ� �Ǻ��ϴ� ���α׷��� �ۼ��� ���ô�


import java.util.Scanner;
class Money

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;

		System.out.println("�л��� �̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("���� ������ �Է��ϼ���");
		kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		math = sc.nextInt();

		tot = kor+eng+math;
		avg = (double)tot/3.0;

		System.out.println("**��� ���**");
		System.out.println("�̸�"+name);
		System.out.println("����"+kor);
		System.out.println("����"+eng);
		System.out.println("����"+math);
		System.out.println("����"+tot);
		System.out.println("���"+avg);

		if(kor>=90 && avg>=90)
			System.out.println(name+"�����б� ����");
		else
			System.out.println(name+"�����б� ������");



	}
}
