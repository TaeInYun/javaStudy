
import java.util.Scanner;  
class FindSeason

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("월을 입력하시오.");
		month = sc.nextInt();
		String season ="";

		if(month >12 || month <1){
			System.out.println("입력값이 잘못되었습니다.");
		}else{
			
			switch(month){
				case 3:season ="봄";break;
				case 4:season ="봄";break;
				case 5:season ="봄";break;
				case 6:
				case 7:
				case 8:season ="여름";break; //이렇게 묶어도
				case 9: case 10: case 11:season ="가을";break; //이런식으로 묶어도 됨
				case 12: case 1: case 2:season ="겨울";break;
			}

			System.out.println(month+"월의 계절은 "+season+"입니다.");
		}

		}
}
