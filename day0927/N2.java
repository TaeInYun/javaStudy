//����) �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40�� �̻����� �Ǻ�
// �Ͽ� ����ϰ��� ��������� ����� ����ϵ��� ���α׷��� �����غ��ϴ�.
// ���ش� 2021

import java.util.Scanner;
class N2{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 double x;
 System.out.println("�Ǽ�x�� �Է��ϼ���");

 x = sc.nextDouble();
//double y = 3*x*x*x-7*x*x+9; // ������ ����
 double y = 3*Math.pow(x,3) -7*Math.pow(x,2) + 9;
 System.out.println("���׽��� ���� "+y+"�Դϴ�.");
 
}
}
