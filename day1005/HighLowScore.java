//���� 10���� ������ �Է� �޾� �ְ������� ���� ����
import java.util.Scanner;
class HighLowScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		//int []score = new int[10];
		for(int i=0 ; i<score.length;i++){
			System.out.print( (i+1) + "��° �л��� ������ �Է��Ͻÿ�==>");
			score[i] = sc.nextInt();
		}

		int max, min;
		max = score[0];
		min = score[0];

		// �迭�߿� ���� ū���� ���� �������� ã����
		//���� ū ���� �ƴ϶�� �������� ���� �Ǵ� ���� �ƴϱ� ������ 
		// ū���� ã������ if ���� ���� ���� ã�� ���� if���� ���� ��� �մϴ�.
		//{5,2,3,6,1} 
		// ���� �迭�� ���Ұ� ���� ������
		// max = 5�� ��� �ְ�
		// min = 2�� ��� �ְ�
		//i�� 2��� �Ҷ��� �迭�� i��° ������ �� 3�� max�� �� 5���� ũ�� �ʴٰ� 
		// min�� ���� ���� �����
		// ���� min���� i��° ������ �� 3���� �� ���� ���� �־��
		// ���� ū ���� ã�� if�� else�� ó���Ͽ� ���� ���� ������ �����  
		for(int i=1;i<score.length;i++){ 
			if(score[i] > max){
				max = score[i];  
			}
			 if(score[i] < min){
				min = score[i];  //else if �� �����ϱ��ѵ� if���°� �Ϲ�����
			}
		}
		

		/*
		for(int i=1;i<score.length;i++){ 
			if(score[i] < min){
				min = score[i];  
			}
			
		}
		*/
        System.out.println("�ְ�������"+ max);
		System.out.println("����������"+ min);
		
	}
}
