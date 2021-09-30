// 사용자한테 월을 입력받아 그월의 마미막 날짜를 출력하는 프로그램을 작성해 봅니다.
//<처리조건> 31일 1,3,5,7,8,10,12
//30일 4,6,9,11
//28일 2
//월을 입력하세요 == 9 9월은 30일까지 있어요

import java.util.Scanner;
class LastDate

{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 int month, last=31;
	 //String name="";
	 System.out.println("월을 입력하시오");
	  month = sc.nextInt(); 

	  if(month <1 || month>12){
		System.out.println("입력값이 잘못되었습니다.");
	  }else{
		if(month == 2){
			last = 28;
		}else if(month ==4 ||month ==6 ||month ==9 ||month ==11){
			last = 30;
	  }
	  System.out.println(month +"월은" +last+"일까지 있어요!");

	  }
	}
}

	

