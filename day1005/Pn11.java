import java.util.Scanner;
class Pn11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("����n�� �Է��Ͻÿ�");
		n = sc.nextInt();

		if (n<0){
		System.out.print("�߸� �Է��߽��ϴ�.");
		}
		else
			for(int i=1;i<=n;i++){
				if(i%3 ==0){
					System.out.print(i+" ");
				}
			}
	}
}