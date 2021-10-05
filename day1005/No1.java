//연습문제 5명 학생의 이름과 점수를 입력 받아 성적이 높은 순서대로 정렬
import java.util.Scanner;
class No1  //정렬 순서대로 값을 표현 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int []score = new int[5];
		String []name = new String[5]; 
		//String name1, name2, name3, name4, name5;
		//String []names = new String[5];

		


        for(int i=0 ; i<score.length;i++){
			System.out.print((i+1) + "학생의 이름을 입력하시오");
			name[i] = sc.next();
			System.out.print( (i+1) + "번째 학생의 점수를 입력하시오==>");
			score[i] = sc.nextInt();
		}


		for(int i =0;i<score.length;i++){
			for(int j =i+1;j<score.length;j++){
			if(score[j]>score[i]){
				int temp = score[i]; //임시변수 선언
				String temp2 = name[i];
				score[i] =score[j];
				name[i] = name[j];
				score[j] = temp;
				name[j] = temp2;
				//다시 임시변수를 j로 옮김
			}
			}
			/*
			System.out.println ("오름차순 정렬 결과");
			System.out.println (data[i]+ " ");
			*/
		}
		
		System.out.println ("***오름차순 정렬 결과***");
		for(int i =0;i<score.length;i++){
			System.out.print (name[i]+ " ");
			System.out.print (score[i]+ " ");
	}
			
		
	}
}