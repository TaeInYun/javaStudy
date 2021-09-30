//


import java.util.Scanner;
class SeasonName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		String name="";
		System.out.println("월을 입력하시오");
		month = sc.nextInt();
		if(month>= 3 && month<= 5){
			name ="봄";
		}else if(month>= 6 && month =< 8){
			name = "여름";
		}else if(month>= 9 && month =< 11){
			name = "가을";
		}else if(month == 1 || month == 2 || month == 12){
			name = "겨울";
		}


		System.out.println(month + "월은" +name + "입니다.");

		/*if(month ==3 || month ==4 || month ==5){
		System.out.println("봄입니다.");
			}
		else if(month ==6 || month ==7 || month ==8){
		System.out.println("여름입니다.");
			}
		else if(month ==9 || month ==10 || month ==11){
		System.out.println("가을입니다.");
			}
		else if(month ==12 || month ==1 || month ==2){
		System.out.println("겨울입니다.");
			}
			*/

		



	}
}
