//연습 학생의 이름,국어,영어,수학을 입력받아 국어점수가 90점이상이고 평균점수가 90점이상이면 장학금을 지급하려고 합니다.
//장학금 지급여부를 판별하는 프로그램을 작성해 봅시다


import java.util.Scanner;
class Money

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;

		System.out.println("학생의 이름을 입력하세요");
		name = sc.next();
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();

		tot = kor+eng+math;
		avg = (double)tot/3.0;

		System.out.println("**결과 출력**");
		System.out.println("이름"+name);
		System.out.println("국어"+kor);
		System.out.println("영어"+eng);
		System.out.println("수학"+math);
		System.out.println("총점"+tot);
		System.out.println("평균"+avg);

		if(kor>=90 && avg>=90)
			System.out.println(name+"님장학금 지급");
		else
			System.out.println(name+"님장학금 부지급");



	}
}
