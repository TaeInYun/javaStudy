
//연습 홍대에 있는 쌍용클럽에서는 물관리를 위하여 이름과 나이와 키를 입력
//받아 입장제한을 하고 있어요 나이가20세 이상이고 키는 160이하이면
// "입장가능" 그렇지 않으면 "입장불가능"을 출력하는 프로그램을 작성하고 끝


import java.util.Scanner;

class Club{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
 String name;
 int age,tall;
 System.out.println("이름를 입력하시오 ==>");
 name = sc.next();
 System.out.println("나이를 입력하시오 ==>");
 age = sc.nextInt();
 System.out.println("키를 입력하시오 ==>");
 tall = sc.nextInt();

 if(age>=20 && 160>=tall) //and
 System.out.println(name+"님 입장가능");
 else
 System.out.println(name+"님 입장불가능");
 
}
}