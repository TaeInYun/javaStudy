
import java.util.Scanner;
class SwitchTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9������ ���� �Է��Ͻÿ�==>");
		n = sc.nextInt(); //1 

		switch(n){
			case 0:  //�ݵ�� �������
				System.out.println("��");
				break;
			case 1:System.out.println("��"); //�ٿ��� �ص���
			case 2:System.out.println("��");// ; ���� �ؼ� ���
			case 3:System.out.println("��");break;
			case 4:System.out.println("��");
			case 5:System.out.println("��");
			case 6:System.out.println("��");
			case 7:System.out.println("ĥ");break;
			case 8:System.out.println("��");
			case 9:System.out.println("��");
			default:System.out.println("�Է¹����� �Ѿ����ϴ�.");

		}
		System.out.println("����");
	}
}