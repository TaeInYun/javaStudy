//���� ����� ���� ��� n�� �Է¹޾� 1���� n������ ¦���� ��, Ȧ���� ��, ¦���� ����, Ȧ���� ������ ���� ���Ͽ� ����ϴ� 
//���α׷��� �ۼ��� ���ϴ�.

import java.util.Scanner;
class Evensum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, even_sum=0,odd_sum=0,even_cnt =0,odd_cnt=0;
	

		System.out.print("�� n�� �Է��Ͻÿ�");
		n = sc.nextInt();
			
			//i:1,2,3,4,5,6 ... n
			//
			for(int i=1;i<=n;i++){
				if(i%2==0){
				even_sum +=i; //even_sum = even_sum +i;  // i�� ¦���� �����߱� ������ i�� ���ص� ¦���� ���ϴ°ſ� ���� ����i+2���ص���
				even_cnt++; //even_cnt = even_cnt +1;
				}else{
				 odd_sum+=i;
				 odd_cnt++;
				}
				
			}
			

System.out.println("1���� "+n+"������ ¦���� ���� " +even_sum);
System.out.println("1���� "+n+"������ ¦���� ������ " +even_cnt);
System.out.println("1���� "+n+"������ Ȧ���� ���� " +odd_sum);
System.out.println("1���� "+n+"������ Ȧ���� ������ " + odd_cnt);


	}
}
