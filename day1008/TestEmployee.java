import java.util.Scanner;

class Employee
{
	String name;
	String addr;
	int salary;
	String phone;

}





class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee []s = new Employee[5]; // Employee []s; s = new Employee[5];
		for(int i=0;i<s.length;i++){
			s[i] =new Employee();  //반드시 객체 선언
			System.out.printf("%d번째 사원의 이름을 입력하시오--->",i+1);
			s[i].name = sc.next();
			System.out.printf("%d번째 사원의 주소을 입력하시오--->",i+1);
			s[i].addr = sc.next();
			System.out.printf("%d번째 사원의 월급 입력하시오--->",i+1);
			s[i].salary = sc.nextInt();
			System.out.printf("%d번째 사원의 전화번호을 입력하시오--->",i+1);
			s[i].phone = sc.next();
		}




		     System.out.println("****결과****");
			 for(int i=0; i<s.length; i++){
				System.out.printf("%s\t%s\t%d\t%s",s[i].name,s[i].addr,s[i].salary,s[i].phone);
			 }

	  }
  }
}