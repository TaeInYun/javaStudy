// 연습문제 사용자한테 이름과 출생년도를 입력받아 무료암검진 대상자인지 판별하여 출력하는 프로그램
// 처리조건 무료암검진 대상자의 나이40세이상 그해가 짝수연도이라면 짝수연도에 태어난 사람 그해가 홀수 연도라면 홀수 연도에 태어난 사람
//40세이상 암검진 항목 위암,간암
//50세이상 암검진 항목 위암, 간암,대장암
import java.util.Scanner;  
import java.util.Date;
class Cancerfree
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int born, age;
		int thisYear;
		thisYear = today.getYear()+1900;
		System.out.print("이름을 입력하시오");
		name = sc.next();
		System.out.print("출생연도를 입력하시오");
		born = sc.nextInt();
		age = (thisYear-born);

		if(age>=40){
			if(thisYear%2==0 && born%2 ==0){
				System.out.print("40세이상 암검진 항목 위암,간암입니다.");
		}
	}else if(thisYear%2==1 && born%2 ==1){
				System.out.print("40세이상 암검진 항목 위암,간암입니다.");
	}
	else if(age>=50){
		if(thisYear%2==0 && born%2 ==0){
				System.out.print("50세이상 암검진 항목 위암,간암,대장암입니다.");
		}
	}else if(thisYear%2==1 && born%2 ==1){
				System.out.print("50세이상 암검진 항목 위암,간암,대장암입니다.");
		


	}

}
}
