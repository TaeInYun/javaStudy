//�������� 5�� �л��� �̸��� ������ �Է� �޾� ������ ���� ������� ����
/*
�����α׷��� 5���� �̸�,����,����,������ �Է¹޾� ������ ����� ���Ѵ���
���������� �����Ͽ� ����ϴ� ���α׷��Դϴ�.
���������� ������ ����
������ ���� ������ �̸��� �ٲ��ְ�, ����,����,����,����,����� ������ ��� �ٲ� ����ϴ� ���� 
���ŷο�
���࿡ �Ѹ��� �л��� ���� ���� ������ 20�� �̻��� �Ѵ´ٸ�
������ �ٲ� �ִ� ���� ������

�̷����� �Ѹ��� �л��� ������ �����ϱ⿡ �ʿ���
�̸�,����,����,����,����,����� �ϳ��� ��Ʈ�� ����� �ִµ�
�װ��� "Ŭ����"�� ����ٰ� �մϴ�.
�̷��� Ŭ������ ����� �θ� �Ѹ��� ������ ���� ���� �ִ� ���� �ƴ϶�
�ϳ��� ��Ʈ�� ǥ���� �� ������ �����Ҷ� ��ó�� �ϴ� ���� �����մϴ�.
*/

import java.util.Scanner;
class Stduent
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}





class No3b  //���� ������� ���� ǥ�� 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    String name;
		Student s = new Student(); //��ä ����  student s ��ü �������� s.name = ȫ�浿 s.korea = 100 .�� ��� ���� ������ ��=���
		s.name = "ȫ�浿";
		s.kor = 100;
		s.eng = 80;
		s.math = 90;

		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot/3.0;

		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.kor);
		System.out.println("����:"+s.eng);
		System.out.println("����:"+s.math);
		System.out.println("����:"+s.tot);
		System.out.println("���:"+s.avg);
	}
}