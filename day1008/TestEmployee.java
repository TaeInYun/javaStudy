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
			s[i] =new Employee();  //�ݵ�� ��ü ����
			System.out.printf("%d��° ����� �̸��� �Է��Ͻÿ�--->",i+1);
			s[i].name = sc.next();
			System.out.printf("%d��° ����� �ּ��� �Է��Ͻÿ�--->",i+1);
			s[i].addr = sc.next();
			System.out.printf("%d��° ����� ���� �Է��Ͻÿ�--->",i+1);
			s[i].salary = sc.nextInt();
			System.out.printf("%d��° ����� ��ȭ��ȣ�� �Է��Ͻÿ�--->",i+1);
			s[i].phone = sc.next();
		}




		     System.out.println("****���****");
			 for(int i=0; i<s.length; i++){
				System.out.printf("%s\t%s\t%d\t%s",s[i].name,s[i].addr,s[i].salary,s[i].phone);
			 }

	  }
  }
}