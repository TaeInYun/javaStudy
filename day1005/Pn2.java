
import java.util.Scanner;
class  Pn2
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   String P;
	   char R,S,C;
	   int width, high;
	   double result =0;
		System.out.print("���ϴ� ������ �����Ͻÿ�");
		P =sc.next();


			if(P == R){
				System.out.println("�簢���� ���θ� �Է��Ͻÿ�.");
				width = sc.nextInt();
				System.out.println("�簢���� ���θ� �Է��Ͻÿ�.");
				high = sc.nextInt();
				result = (double)width*high;
			}


			else if(P == S){
				System.out.println("�ﰢ���� ���θ� �Է��Ͻÿ�.");
				width = sc.nextInt();
				System.out.println("�ﰢ���� ���θ� �Է��Ͻÿ�.");
				high = sc.nextInt();
				result = (double)width*high/2;
			}


			else if(P == C){
				System.out.println("���� �������� �Է��Ͻÿ�.");
				width = sc.nextInt();
				result = (double)width*width*3.14;
			}
			else
				System.out.println("�߸� �Է��߽��ϴ�.");

	    System.out.println("������" + result + "�Դϴ�");



	}
}