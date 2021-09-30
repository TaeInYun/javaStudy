import java.util.Scanner;
class Exam06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double height, userweight,normalweight ;
		System.out.print("키를 입력하시오");
		height = sc.nextDouble();
		System.out.print("몸무게를 입력하시오");
		userweight = sc.nextDouble();
		String formula ="";

		normalweight = (height-100)*0.9;

		if(normalweight == userweight ){
			formula = "표준";
		}
		else if(normalweight < userweight){
			formula = "과체중";
		}
		else if(normalweight > userweight){
			formula = "저체중";
		}
		System.out.println("당신은"+formula+"입니다.");

	}
}
