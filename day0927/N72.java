//��������7�� (�Ǽ�)

import java.util.Scanner;
class N72{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 int com,c,eng,math,tot;
 double avg;
 


    System.out.println("��ǻ�� ���� ���� ������ �����ΰ���?");
    com = sc.nextInt();
    System.out.println("C��� ���α׷��ְ��� ������ �����ΰ���?");
    c = sc.nextInt();
    System.out.println("���� ���� ������ �����ΰ���?");
    eng = sc.nextInt();
    System.out.println("�Ϲ� ���� ���� ������ �����ΰ���?");
    math = sc.nextInt();

    tot= com + c +  eng + math;  
  avg =tot/4;
 System.out.println("��������� "+avg);


}
}
