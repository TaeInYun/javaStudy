// �������� ��������� �̸��� ����⵵�� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� ����ϴ� ���α׷�
// ó������ ����ϰ��� ������� ����40���̻� ���ذ� ¦�������̶�� ¦�������� �¾ ��� ���ذ� Ȧ�� ������� Ȧ�� ������ �¾ ���
//40���̻� �ϰ��� �׸� ����,����
//50���̻� �ϰ��� �׸� ����, ����,�����
import java.util.Scanner;  
import java.util.Date;
class Cancerfree
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int born, age;
		int thisYear;
		thisYear = today.getYear()+1900;
		System.out.print("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.print("��������� �Է��Ͻÿ�");
		born = sc.nextInt();
		age = (thisYear-born);

		if(age>=40){
			if(thisYear%2==0 && born%2 ==0){
				System.out.print("40���̻� �ϰ��� �׸� ����,�����Դϴ�.");
		}
	}else if(thisYear%2==1 && born%2 ==1){
				System.out.print("40���̻� �ϰ��� �׸� ����,�����Դϴ�.");
	}
	else if(age>=50){
		if(thisYear%2==0 && born%2 ==0){
				System.out.print("50���̻� �ϰ��� �׸� ����,����,������Դϴ�.");
		}
	}else if(thisYear%2==1 && born%2 ==1){
				System.out.print("50���̻� �ϰ��� �׸� ����,����,������Դϴ�.");
		


	}

}
}