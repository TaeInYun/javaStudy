// ���ο����� �ݳ� 40�� �̻��� ����鿡�� ����ϰ����� 
//�ǽ��ϰ� �ְ� �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40�� �̻����� �Ǻ�
//<ó������>
//�ϰ��� ����ڴ� 40�� �̻��̰� ���ذ� ¦�������̸� ¦��������
//�¾��� ���ذ� Ȧ�� �����̸� Ȧ�������� �¾ ��� 


import java.util.Scanner;
import java.util.Date; // date
class Free04{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
Date today = new Date();  //date
String name;
int age, born;
int thisYear; //date
thisYear = today.getYear()+1900;  //date 
System.out.println("�̸��� �Է��Ͻÿ� ==>");
name = sc.next();
System.out.println("����⵵�� �Է��Ͻÿ� ==>");
born = sc.nextInt();
age = (thisYear-born);
if(age>=40 && thisYear % 2 == born % 2)
System.out.println(name+"��"+ thisYear+"�⵵�� ����ϰ���������Դϴ�.");
else
System.out.println(name+"�� "+ thisYear+"�⵵�� ����ϰ�������ڰ� �ƴմϴ�.");
}
}
