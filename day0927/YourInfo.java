import java.util.Scanner;  // 오라클 홈페이지에 있는 스케너 위치 
class YourInfo{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in); // 스캐너를 사용하기 위한 선언 키보드로 부터 입력 받겠음
      String name; // 변수선언 (String 문자열 자료형 변수이름)
      int age;    //  변수선언 (int 정수값 자료형 변수이름)
      System.out.println("당신의 이름은 무엇인가요?"); // 이름을 입력받는 문장을 위로 올림
      name = sc.next(); // name에 저장 = (오른쪽 기능 구현후 왼쪽에 저장) 문자열을 입력 받기 위해서 사용하는 기능 next
      System.out.println("당신의 나이는 몇살인가요?");
      age = sc.nextInt(); 
      System.out.println("반갑습니다! 당신의 이름은 "+name+"이고, 나이는"+age+"살 이군요");

 } 
}