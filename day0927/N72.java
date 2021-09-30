//연습문제7번 (실수)

import java.util.Scanner;
class N72{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 int com,c,eng,math,tot;
 double avg;
 


    System.out.println("컴퓨터 개론 과목 점수는 몇점인가요?");
    com = sc.nextInt();
    System.out.println("C언어 프로그래밍과목 점수는 몇점인가요?");
    c = sc.nextInt();
    System.out.println("영어 과목 점수는 몇점인가요?");
    eng = sc.nextInt();
    System.out.println("일반 수학 과목 점수는 몇점인가요?");
    math = sc.nextInt();

    tot= com + c +  eng + math;  
  avg =tot/4;
 System.out.println("평균점수는 "+avg);


}
}
