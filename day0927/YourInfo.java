import java.util.Scanner;  // ����Ŭ Ȩ�������� �ִ� ���ɳ� ��ġ 
class YourInfo{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in); // ��ĳ�ʸ� ����ϱ� ���� ���� Ű����� ���� �Է� �ް���
      String name; // �������� (String ���ڿ� �ڷ��� �����̸�)
      int age;    //  �������� (int ������ �ڷ��� �����̸�)
      System.out.println("����� �̸��� �����ΰ���?"); // �̸��� �Է¹޴� ������ ���� �ø�
      name = sc.next(); // name�� ���� = (������ ��� ������ ���ʿ� ����) ���ڿ��� �Է� �ޱ� ���ؼ� ����ϴ� ��� next
      System.out.println("����� ���̴� ����ΰ���?");
      age = sc.nextInt(); 
      System.out.println("�ݰ����ϴ�! ����� �̸��� "+name+"�̰�, ���̴�"+age+"�� �̱���");

 } 
}