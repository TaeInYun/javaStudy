//������ ����

import java.util.Scanner;
class Pn1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String sign;
		//String +, -, *, /
		int n1=0, n2=0;

		System.out.print("��ȣ�� �Է��Ͻÿ�");
		sign = sc.next();

		System.out.print("ù���� ���ڸ� �Է��Ͻÿ�");
		n1 = sc.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�");
		n2 = sc.nextInt();


		if(sign == + ){
			n= n1+n2;
			System.out.println(n);
		}
		   else if(sign == - ){
			n = n1-n2;
			System.out.println(n);
		}
		else if(sign == * ){
			n = n1*n2;
			System.out.println(n);
		}
		else if(sign == / ){
			if(b == 0){
			 System.out.println("�и�� 0�� �ü� �����ϴ�.");
			}else{
				n = n1/n2;
			 System.out.println(n);
			}
		}




	}
}