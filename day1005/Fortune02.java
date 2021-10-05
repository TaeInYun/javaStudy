import java.util.Scanner;
class Fortune02
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		String name;
		int year, month, date, time;

		System.out.print("이름을 입력하시오");
		name = sc.next();
		System.out.print("생년를 입력하시오");
		year = sc.nextInt();
		System.out.print("생월을 입력하시오")
		month = sc.nextInt;
		System.out.print("생일을 입력하시오")
		date = sc.nextInt;
		System.out.print("생시을 입력하시오")
		time = sc.nextInt;

		if(year%12 ==0){
			System.out.print("신");
		}

