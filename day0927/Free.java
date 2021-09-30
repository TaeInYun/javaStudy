//연습) 정부에서는 매년 40세 이상인 사람들에게 무료암검진을
//실시하고 있습니다. 이름과 나이를 입력받아 무료암검진 대상자인지
//판별하여 결과를 출력하는 프로그램 만들어라

import java.util.Scanner;
class Free{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 String name;
 int age;
 System.out.println("이름를 입력하시오 ==>");
 name = sc.next();
 System.out.println("나이를 입력하시오 ==>");
 age = sc.nextInt();
 if(age>=40)
 System.out.println(name+"은 무료암검진대상자입니다.");
 else
 System.out.println(name+"은 무료암검진대상자가 아닙니다.");
 
}
}
