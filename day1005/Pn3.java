
import java.util.Scanner;
class  Pn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,tot;
		int price = 100;

		System.out.print("������ � �����Ͻǰǰ���?");
		n = sc.nextInt();

		tot = price*n;

		if(n>=10){
			tot = (int)(tot*0.9);
			//System.out.println((100*n)*0.9+"���Դϴ�");
			System.out.println("��ü������" + tot +"���Դϴ�");
			}
		else{
			System.out.println(100*n+"���Դϴ�"); //���� tot���� �̹� ���� ������ �ɾ��� ������ ���� else���ص���
			
		}

		   



	}
}
