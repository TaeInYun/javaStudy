//연습 10명의 점수를 입력 받아 최고점수와 최저 점수
import java.util.Scanner;
class HighLowScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		//int []score = new int[10];
		for(int i=0 ; i<score.length;i++){
			System.out.print( (i+1) + "번째 학생의 점수를 입력하시오==>");
			score[i] = sc.nextInt();
		}

		int max, min;
		max = score[0];
		min = score[0];

		// 배열중에 가장 큰값과 가장 작은값을 찾을때
		//가장 큰 값이 아니라고 가장작은 값이 되는 것은 아니기 때문에 
		// 큰값을 찾기위한 if 문과 작은 값을 찾기 위한 if문을 따로 써야 합니다.
		//{5,2,3,6,1} 
		// 만약 배열의 원소가 위와 같을때
		// max = 5가 담겨 있고
		// min = 2가 담겨 있고
		//i가 2라고 할때에 배열의 i번째 원소의 값 3이 max의 값 5보다 크지 않다고 
		// min에 넣을 수는 없어요
		// 현재 min에는 i번째 원소의 값 3보다 더 작은 값이 있어요
		// 따라서 큰 값을 찾는 if와 else로 처리하여 작은 값에 넣을수 없어요  
		for(int i=1;i<score.length;i++){ 
			if(score[i] > max){
				max = score[i];  
			}
			 if(score[i] < min){
				min = score[i];  //else if 도 가능하긴한데 if쓰는게 일반적임
			}
		}
		

		/*
		for(int i=1;i<score.length;i++){ 
			if(score[i] < min){
				min = score[i];  
			}
			
		}
		*/
        System.out.println("최고점수는"+ max);
		System.out.println("최저점수는"+ min);
		
	}
}
