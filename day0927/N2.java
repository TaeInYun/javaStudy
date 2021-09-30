//연습) 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살 이상인지 판별
// 하여 무료암검진 대상자인지 결과를 출력하도록 프로그램을 수정해봅니다.
// 올해는 2021

import java.util.Scanner;
class N2{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 double x;
 System.out.println("실수x를 입력하세요");

 x = sc.nextDouble();
//double y = 3*x*x*x-7*x*x+9; // 세제곱 제곱
 double y = 3*Math.pow(x,3) -7*Math.pow(x,2) + 9;
 System.out.println("다항식의 값은 "+y+"입니다.");
 
}
}
