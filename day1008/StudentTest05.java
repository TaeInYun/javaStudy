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

 class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}





class StudentTest05  //���� ������� ���� ǥ�� 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[5];
		for(int i=0;i<s.length;){
			s[i] =new Student();  //�ݵ�� ��ü ����
			System.out.printf("%d��° �л��� �̸��� �Է��Ͻÿ�--->",i+1);
			s[i].name = sc.next();
			System.out.printf("%d��° �л��� ���������� �Է��Ͻÿ�--->"i+1);
			s[i].kor = sc.nextInt();
			System.out.printf("%d��° �л��� ���������� �Է��Ͻÿ�--->"i+1);
			s[i].eng = sc.nextInt();
			System.out.printf("%d��° �л��� ���������� �Է��Ͻÿ�--->"i+1);
			s[i].math = sc.nextInt();
			s[i].tot = s[i].kor + s[i].eng + s[i].math;
			s[i].avg = s[i].tot /3.0;
		}

		//������ ���� ������ ���� �� ���ϴ�.
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++ ){
				if(s[j].avg>s[i].avg){
				student	temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				}
			}
		}

		System.out.println("*** ���� ó�� ���***");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0;i<s.length;i++){
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%f.1\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].tot,s[i]avg);
		}

	}
}

/*

javac StudentTest01.java
StudentTest01.java:37: error: cannot find symbol
                Student s;
*/