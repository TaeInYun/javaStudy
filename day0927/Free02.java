//����) �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40�� �̻����� �Ǻ�
// �Ͽ� ����ϰ��� ��������� ����� ����ϵ��� ���α׷��� �����غ��ϴ�.
// ���ش� 2021

import java.util.Scanner;
class Free02{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 String name;
 int age, born;
 int thisYear;
 thisYear = 2021;
 System.out.println("�̸��� �Է��Ͻÿ� ==>");
 name = sc.next();
 System.out.println("��������� �Է��Ͻÿ� ==>");
 born = sc.nextInt();
 age = (thisYear-born);
 if(age>=40)
 System.out.println(name+"�� "+age+"���Դϴ�. ����ϰ���������Դϴ�.");
 else
 System.out.println(name+"�� "+age+"���Դϴ�. ����ϰ�������ڰ� �ƴմϴ�.");
 
}
}
