//


import java.util.Scanner;
class SeasonName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		String name="";
		System.out.println("���� �Է��Ͻÿ�");
		month = sc.nextInt();
		if(month>= 3 && month<= 5){
			name ="��";
		}else if(month>= 6 && month =< 8){
			name = "����";
		}else if(month>= 9 && month =< 11){
			name = "����";
		}else if(month == 1 || month == 2 || month == 12){
			name = "�ܿ�";
		}


		System.out.println(month + "����" +name + "�Դϴ�.");

		/*if(month ==3 || month ==4 || month ==5){
		System.out.println("���Դϴ�.");
			}
		else if(month ==6 || month ==7 || month ==8){
		System.out.println("�����Դϴ�.");
			}
		else if(month ==9 || month ==10 || month ==11){
		System.out.println("�����Դϴ�.");
			}
		else if(month ==12 || month ==1 || month ==2){
		System.out.println("�ܿ��Դϴ�.");
			}
			*/

		



	}
}
