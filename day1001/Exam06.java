import java.util.Scanner;
class Exam06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double height, userweight,normalweight ;
		System.out.print("Ű�� �Է��Ͻÿ�");
		height = sc.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ�");
		userweight = sc.nextDouble();
		String formula ="";

		normalweight = (height-100)*0.9;

		if(normalweight == userweight ){
			formula = "ǥ��";
		}
		else if(normalweight < userweight){
			formula = "��ü��";
		}
		else if(normalweight > userweight){
			formula = "��ü��";
		}
		System.out.println("�����"+formula+"�Դϴ�.");

	}
}
