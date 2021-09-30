//사용자 한테 가로길이와 세로길이를 입력 받아 사각형의 면적을 
//계산하여 출력하는 프로그램을 작성하고 저장하고 컴파일하고 
//실행해라 (단 가로,세로길이는 정수)

import java.util.Scanner;
class Rectangle02{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.println("가로길이를 입력하시오.");
a = sc.nextInt();
System.out.println("세로길이를 입력하시오.");
b = sc.nextInt();
c = a*b;

  System.out.println("사각형의 면적은"+c+" 입니다.");


}
}