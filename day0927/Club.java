
//���� ȫ�뿡 �ִ� �ֿ�Ŭ�������� �������� ���Ͽ� �̸��� ���̿� Ű�� �Է�
//�޾� ���������� �ϰ� �־�� ���̰�20�� �̻��̰� Ű�� 160�����̸�
// "���尡��" �׷��� ������ "����Ұ���"�� ����ϴ� ���α׷��� �ۼ��ϰ� ��


import java.util.Scanner;

class Club{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 String name;
 int age,tall;
 System.out.println("�̸��� �Է��Ͻÿ� ==>");
 name = sc.next();
 System.out.println("���̸� �Է��Ͻÿ� ==>");
 age = sc.nextInt();
 System.out.println("Ű�� �Է��Ͻÿ� ==>");
 tall = sc.nextInt();

 if(age>=20 && 160>=tall) //and
 System.out.println(name+"�� ���尡��");
 else
 System.out.println(name+"�� ����Ұ���");
 
}
}