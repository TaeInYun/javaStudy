//연습 구매수량이10개 이상이거나 구매금액이 20000원이상이면 구매금액의 10%를 할인해줌
import java.util.Scanner;
class Cost 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int price, number, cost0;
		double dis0;

		System.out.println("구매물품의 이름을 입력하시오.");
		name = sc.next();
		System.out.println("구매 물품의 가격을 입력하시오");
		price = sc.nextInt();
		System.out.println("구매 물품의 개수을 입력하시오");
		number = sc.nextInt();

		cost0 = price*number;
		dis0 = (cost0*0.9);

		//System.out.println("지급금액은 " +dis0+"원입니다.");
		System.out.println("***결과출력***");
		System.out.println("상품명:" +name);
		System.out.println("단가:" +price);
		System.out.println("수량:" +number);
		System.out.println("총금액:" +cost0);

		/* if( number >=10 || cost0 >=)
		System.out.println("지불금액은 10%할인하여" +(cost0*0.9)+" 원 입니다.")
		else
			System.out.println("지급금액은 " +cost0+"원입니다.");
			*/
		
		if(number >=10 || cost0 >20000)
			System.out.println("지급금액은 " +dis0+"원입니다.");
		else
			System.out.println("지급금액은 " +cost0+"원입니다.");


	


	}
}
