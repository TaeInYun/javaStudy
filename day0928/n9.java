import java.util.Scanner;
class N9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,div,div1,mode1,div2,mode2,div3,mode3 ;
       System.out.print("10000미만의 정수를 입력하시오:");
	   n = sc.nextInt();

	   div1 = n/1000; // 5
	   mode1 = n%1000; //623
	   div2 = mode1/100; //6
	   mode2 = mode1%100; //23
	   div3 = mode2/10; //2
	   mode3 = mode2%10; //3

	   System.out.println("천의 자리:" +div1);
	   System.out.println("백의 자리:" +div2);
	   System.out.println("십의 자리:" +div3);
	   System.out.println("일의 자리:" +mode3);
	  


	}
}
