//연습) 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살 이상인지 판별
// 하여 무료암검진 대상자인지 결과를 출력하도록 프로그램을 수정해봅니다.
// 올해는 2021

import java.util.Scanner;
import java.util.Date;
class Free03{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 Date today = new Date();
 String name;
 int age, born;
 int thisYear;
 thisYear = today.getYear()+1900;
 System.out.println("이름를 입력하시오 ==>");
 name = sc.next();
 System.out.println("출생연도를 입력하시오 ==>");
 born = sc.nextInt();
 age = (thisYear-born);
 System.out.println("올해는 "+thisYear+"년도입니다.");
 if(age>=40)
 System.out.println(name+"님 "+age+"세입니다. 무료암검진대상자입니다.");
 else
 System.out.println(name+"님 "+age+"세입니다. 무료암검진대상자가 아닙니다.");
 
}
}
