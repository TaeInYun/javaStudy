//������ ����

import java.util.Scanner;
class Pn1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char sign;
		//String sign;
		//String +, -, *, /
		int n1,n2;
		//int n1=0, n2=0;

		System.out.print("�����ڸ� �Է��Ͻÿ�");
		sign = sc.next().charAt(0); //+ �� �Է��ϸ� char 0��° ������ �Է�

		System.out.print("ù���� ���ڸ� �Է��Ͻÿ�");
		n1 = sc.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		n2 = sc.nextInt();


		if(sign == '+' ){
			System.out.println(n1+ "+"+n2+"="+(n1+n2));
		}
		   else if(sign == '-' ){
			System.out.println(n1+ "-"+n2+"="+(n1-n2));
		}
		else if(sign == '*' ){
			System.out.println(n1+ "*"+n2+"="+(n1*n2));
		}
		else if(sign == '/' ){
			if(n2 == 0){
			 System.out.println("�и�� 0�� �ü� �����ϴ�.");
			}else{
			 System.out.println(n1+ "/"+n2+"="+(n1/n2));
			}
		}
		else{
			 System.out.println("�߸��� ������");
		}




	}
}
