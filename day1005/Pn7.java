
import java.util.Scanner;
class Pn7
  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 ,n2 ,n3 , min;

		System.out.print("ù��° ���� �Է��ϼ���==>");
		n1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���==>");
		n2 = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ���==>");
		n3 = sc.nextInt();
		
	
		if( n1 < n2 && n1 < n3){
			min = n1;
		}else if(n2<n1 && n2<n3){
			min = n2;
		}else{
			min = n3;
		}
		
		
		
		
		
		
		
		/*
		if(n1<n2){
			if(n1<n3){
				min = n1;
			}else{
				min = n3;
			}
		}else{
			if(n2<n3){
				min = n2;
			}else{
				min = n3;
			}
		}
		*/

		
		/*
		if(n1>n2){
			if(n2>n3) {
				min = n3;
			} else {
				min = n2;
			}
		}else{
			if(n1>n3) {
				min = n3;
			}else {
				min = n1;
			}
		}
		*/
		System.out.print("���� ���� ����"+min+"�Դϴ�.");

	}
}
