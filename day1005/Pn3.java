
import java.util.Scanner;
class  Pn3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,tot;
		int price = 100;

		System.out.print("물건을 몇개 구입하실건가요?");
		n = sc.nextInt();

		tot = price*n;

		if(n>=10){
			tot = (int)(tot*0.9);
			//System.out.println((100*n)*0.9+"원입니다");
			System.out.println("전체가격은" + tot +"원입니다");
			}
		else{
			System.out.println(100*n+"원입니다"); //위에 tot에서 이미 할인 조건을 걸었기 때문에 굳이 else안해도됨
			
		}

		   



	}
}
