// ��������� ������ ���� �Է¹޾� ���߿� ���� ū���� ã�� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class FindBigCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int a,b,c ;
		int a,b,c,max;
		System.out.print("ù��°���� �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.print("�ι�°�� �� �Է��Ͻÿ�");
		b = sc.nextInt();
		System.out.print("����° �� �Է��Ͻÿ�");
		c = sc.nextInt();

		if(a>b){    
			if(a>c) {  // ��ø���ù�
				max = a;
			}else{     // ��ø���ù������� else�� ���� ���� ���� ����� if�� ������
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
		}
		

		System.out.println("����ū���� "+ max+ "�Դϴ�.");

		/*if(a>b && a>c){
			System.out.print("ū��" +a);
		}
		else if (b>a && b>c){   
			System.out.print("ū��" +b);
		}
		else if (c>b && c>a){   
			System.out.print("ū��" +c);
		}
		*/




	}
}
