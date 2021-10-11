//연습문제 5명 학생의 이름과 점수를 입력 받아 성적이 높은 순서대로 정렬
/*
이프로그램은 5명의 이름,국어,영어,수학을 입력받아 총점과 평균을 구한다음
성적순으로 정렬하여 출력하는 프로그램입니다.
성적순으로 정렬할 때에
순서가 맞지 않으면 이름도 바꿔주고, 국어,영어,수학,총점,평균을 일일이 모두 바꿔 줘야하는 것은 
번거로움
만약에 한명의 학생에 대한 성적 정보가 20개 이상이 넘는다면
일일이 바꿔 주는 것은 별로임

이럴때에 한명의 학생의 정보를 관리하기에 필요한
이름,국어,영어,수학,총점,평균을 하나의 세트로 만들수 있는데
그것을 "클래스"를 만든다고 합니다.
이렇게 클래스를 만들어 두면 한명에 정보가 따로 따로 있는 것이 아니라
하나의 세트로 표현할 수 있으니 정렬할때 일처리 하는 것이 수월합니다.
*/

import java.util.Scanner;
class Stduent
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}





class No3b  //정렬 순서대로 값을 표현 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    String name;
		Student s = new Student(); //객채 생성  student s 객체 참조변수 s.name = 홍길동 s.korea = 100 .은 멤버 접근 연산자 힙=멤버
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 80;
		s.math = 90;

		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot/3.0;

		System.out.println("이름:"+s.name);
		System.out.println("국어:"+s.kor);
		System.out.println("영어:"+s.eng);
		System.out.println("수학:"+s.math);
		System.out.println("총점:"+s.tot);
		System.out.println("평균:"+s.avg);
	}
}