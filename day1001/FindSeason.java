
import java.util.Scanner;  
class FindSeason

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("���� �Է��Ͻÿ�.");
		month = sc.nextInt();
		String season ="";

		if(month >12 || month <1){
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}else{
			
			switch(month){
				case 3:season ="��";break;
				case 4:season ="��";break;
				case 5:season ="��";break;
				case 6:
				case 7:
				case 8:season ="����";break; //�̷��� ���
				case 9: case 10: case 11:season ="����";break; //�̷������� ��� ��
				case 12: case 1: case 2:season ="�ܿ�";break;
			}

			System.out.println(month+"���� ������ "+season+"�Դϴ�.");
		}

		}
}