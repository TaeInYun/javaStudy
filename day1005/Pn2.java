
import java.util.Scanner;
class  Pn2
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   char type;
	   //String P;
	   //char R,T,C;
	   double width, high;
	  double result =0;
		System.out.println("������ ������ �Է��ϼ��� R:�簢��,T:�ﰢ��,C:��");
		type =sc.next().charAt(0);


			if(type == 'R'){
				System.out.println("�簢���� ���θ� �Է��Ͻÿ�.");
				width = sc.nextDouble();
				System.out.println("�簢���� ���θ� �Է��Ͻÿ�.");
				high = sc.nextDouble();
				result = (double)width*high;
				 System.out.print("�簢����");
			}


			else if(type == 'T'){
				System.out.println("�ﰢ���� ���θ� �Է��Ͻÿ�.");
				width = sc.nextDouble();
				System.out.println("�ﰢ���� ���θ� �Է��Ͻÿ�.");
				high = sc.nextDouble();
				result = (double)width*high/2;
				System.out.print("�ﰢ����");
			}


			else if(type == 'C'){
				System.out.println("���� �������� �Է��Ͻÿ�.");
				width = sc.nextDouble();
				result = (double)width*width*3.14; // radius ��� ������ ���� �ᵵ ��
				System.out.print("����");
			}
			else{
				System.out.println("�߸� �Է��߽��ϴ�.");
				return; //���⿡�� main�޼ҵ带 ���� �մϴ� �ڿ��� ��� ����
			}


	    System.out.print("������" + result + "�Դϴ�");



	}
}
