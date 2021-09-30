// 정부에서는 격년 40세 이상인 사람들에게 무료암검진을 
//실시하고 있고 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살 이상인지 판별
//<처리조건>
//암검진 대상자는 40세 이상이고 올해가 짝수연도이면 짝수연도에
//태어난사람 올해가 홀수 연도이면 홀수연도에 태어난 사람 


import java.util.Scanner;
import java.util.Date; // date
class Free04{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
Date today = new Date();  //date
String name;
int age, born;
int thisYear; //date
thisYear = today.getYear()+1900;  //date 
System.out.println("이름을 입력하시오 ==>");
name = sc.next();
System.out.println("출생년도를 입력하시오 ==>");
born = sc.nextInt();
age = (thisYear-born);
if(age>=40 && thisYear % 2 == born % 2)
System.out.println(name+"님"+ thisYear+"년도에 무료암검진대상자입니다.");
else
System.out.println(name+"님 "+ thisYear+"년도에 무료암검진대상자가 아닙니다.");
}
}
