// 연습 사용자한테 두개의 정수를 입력받아 
//더하기,빼기, 곱하기, 나누기 한결과를 출력하는 프로그램을 작성하고, 
//저장하고, 컴파일하고, 실행

import java.util.Scanner;
class WorkTest{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("정수a를 입력하시오.");
    a = sc.nextInt(); 
    System.out.println("정수b를 입력하시오.");
    b = sc.nextInt(); 
 
    System.out.println("**결과 출력**");
    System.out.println("더하기:"+(a+b));
    System.out.println("빼기:"+(a-b));
    System.out.println("곱하기:"+(a*b));
    System.out.println("나누기:"+(a/b));

}
}
