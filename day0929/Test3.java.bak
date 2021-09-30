//연습 학생의 이름,국영수를 입력받아 총점과 평균을 구하여 출력한뒤 평균이 60이상이면 합격 그렇지 않으면 불합격 출력



import java.util.Scanner;
class Test3
 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.println("학생의 이름을 입력하세요");
		name = sc.next();
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();

		tot = kor+eng+math;
		avg = (double)tot/3;

		System.out.println("총점은"+tot+"입니다.");
		System.out.println("평균은"+avg+"입니다.");

		if (avg >= 60 )
		System.out.println("합격");
		else
		System.out.println("불합격");


	}
}
