//�������� 5�� �л��� �̸��� ������ �Է� �޾� ������ ���� ������� ����
import java.util.Scanner;
class No1  //���� ������� ���� ǥ�� 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int []score = new int[5];
		String []name = new String[5]; 
		//String name1, name2, name3, name4, name5;
		//String []names = new String[5];

		


        for(int i=0 ; i<score.length;i++){
			System.out.print((i+1) + "�л��� �̸��� �Է��Ͻÿ�");
			name[i] = sc.next();
			System.out.print( (i+1) + "��° �л��� ������ �Է��Ͻÿ�==>");
			score[i] = sc.nextInt();
		}


		for(int i =0;i<score.length;i++){
			for(int j =i+1;j<score.length;j++){
			if(score[j]>score[i]){
				int temp = score[i]; //�ӽú��� ����
				String temp2 = name[i];
				score[i] =score[j];
				name[i] = name[j];
				score[j] = temp;
				name[j] = temp2;
				//�ٽ� �ӽú����� j�� �ű�
			}
			}
			/*
			System.out.println ("�������� ���� ���");
			System.out.println (data[i]+ " ");
			*/
		}
		
		System.out.println ("***�������� ���� ���***");
		for(int i =0;i<score.length;i++){
			System.out.print (name[i]+ " ");
			System.out.print (score[i]+ " ");
	}
			
		
	}
}