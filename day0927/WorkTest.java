// ���� ��������� �ΰ��� ������ �Է¹޾� 
//���ϱ�,����, ���ϱ�, ������ �Ѱ���� ����ϴ� ���α׷��� �ۼ��ϰ�, 
//�����ϰ�, �������ϰ�, ����

import java.util.Scanner;
class WorkTest{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("����a�� �Է��Ͻÿ�.");
    a = sc.nextInt(); 
    System.out.println("����b�� �Է��Ͻÿ�.");
    b = sc.nextInt(); 
 
    System.out.println("**��� ���**");
    System.out.println("���ϱ�:"+(a+b));
    System.out.println("����:"+(a-b));
    System.out.println("���ϱ�:"+(a*b));
    System.out.println("������:"+(a/b));

}
}
