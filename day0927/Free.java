//����) ���ο����� �ų� 40�� �̻��� ����鿡�� ����ϰ�����
//�ǽ��ϰ� �ֽ��ϴ�. �̸��� ���̸� �Է¹޾� ����ϰ��� ���������
//�Ǻ��Ͽ� ����� ����ϴ� ���α׷� ������

import java.util.Scanner;
class Free{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 String name;
 int age;
 System.out.println("�̸��� �Է��Ͻÿ� ==>");
 name = sc.next();
 System.out.println("���̸� �Է��Ͻÿ� ==>");
 age = sc.nextInt();
 if(age>=40)
 System.out.println(name+"�� ����ϰ���������Դϴ�.");
 else
 System.out.println(name+"�� ����ϰ�������ڰ� �ƴմϴ�.");
 
}
}
