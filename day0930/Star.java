/*��������� ������ ������ �Է¹޾�
���ڸ��� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ� �� ���ϴ�.

������==>������
����==> 2
����==> 9
�����δ��� ���ڸ��� �����ڸ��Դϴ�.
*/


import java.util.Scanner;
class Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int month, day;
        System.out.println("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.println("������ �Է��Ͻÿ�");
		month = sc.nextInt();
		System.out.println("������ �Է��Ͻÿ�");
		day = sc.nextInt();
		String name2="";
		


		if(month <1|| month>12 || day<1 || day>31){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(month ==2 && day>28 && day<32){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}
		else{
			switch(month){
			case 1: if(day >=20){
				name2 ="�����ڸ�";
			} else{
				name2 ="�����ڸ�";
			}
			break;
		    case 2:  if(day >=19){
				name2 = "������ڸ�";
			} else{
				name2 = "�����ڸ�";
			}     
			break;
			case 3: if(day >=21){
				name2 = "���ڸ�";
			} else{
				name2 ="������ڸ�";
			} 
			break;
			case 4: if(day >=20){
				name2 ="Ȳ���ڸ�";
			} else{
				name2 ="���ڸ�";
			} 
			break;
			case 5: if(day >=21){
				name2 ="�ֵ����ڸ�";
			} else{
				name2 ="Ȳ���ڸ�";
			} 
			break;
			case 6: if(day >=22){
				name2 ="���ڸ�";
			} else{
				name2 ="�ֵ����ڸ�";
			} 
			break;
			case 7:if(day >=23){
				name2 ="�����ڸ�";
			} else{
				name2 ="���ڸ�";
			} 
			break;
			case 8:if(day >=23){
				name2 ="ó���ڸ�";
			} else{
				name2 ="�����ڸ�";
			} 
			break;
			case 9:if(day >=24){
				name2 ="õ���ڸ�";
			} else{
				name2 ="ó���ڸ�";
			} 
			break;
			case 10:if(day >=23){
				name2 ="�����ڸ�";
			} else{
				name2 ="õ���ڸ�";
			} 
			break;
			case 11:if(day >=23){
				name2 ="����ڸ�";
			} else{
				name2 ="�����ڸ�";
			} 
			break;
			case 12:if(day >=25){
				name2 ="�����ڸ�";
			} else{
				name2 ="����ڸ�";
			} 


			}
		  System.out.print(name+"���� ���ڸ���" +name2+" �Դϴ�.");
	

		
	}
 }
}