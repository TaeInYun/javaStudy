import java.util.Scanner;
class Right
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []answer = {1,2,3,4,1,2,3,4,1,2};
		int []user = new int[10];
		for(int i=0;i<user.length;i++){
			System.out.print((i+1)+"�� ���� �Է��ϼ��� ==>");
			user[i]=sc.nextInt();
		}
		int cnt0=0;
		int cnt1=0;
		for(int i =0;i<answer.length;i++){
			if(user[i]==answer[i]){
				System.out.println((i+1)+" O");
				cnt0++;
			}else{
				System.out.println((i+1)+"X");
				cnt1++;
			}
		}
		System.out.println("�����:"+cnt0+"��");
	    System.out.println("�����:"+cnt1+"��");
	}
}
