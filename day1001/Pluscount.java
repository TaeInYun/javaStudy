import java.util.Scanner;
class Pluscount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;  //i�� ����ڷ� ���� �Է� �ޱ� ������ ���ʱ�ȭ �ʾƵ� ������
		              //sum�� ������ �ؾ� ������ �ʱⰪ�� �����ؾ� �Ѵ�.
					  //������ ���ϱ⸦ �� ���̶� 0���� �ʱ�ȭ �߽��ϴ�.
					  //�־��� �����ذ��� ���Ͽ� �׶� �׶����� ������ ������ �ʱ�ȭ �ؾ� �մϴ�.
		System.out.print("1���� ������� ���ϱ� �ұ��?");
		n= sc.nextInt();
		for(int i=1; i<=n;i++ ){
			sum+=i;
		}
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�.");
		
		
		
	}
}