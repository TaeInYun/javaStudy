//연습 사용자 한테 어떤수 n을 입력받아 1에서 n까지의 짝수의 합, 홀수의 합, 짝수의 개수, 홀수의 개수를 각각 구하여 출력하는 
//프로그램을 작성해 봅니다.

import java.util.Scanner;
class Evensum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, even_sum=0,odd_sum=0,even_cnt =0,odd_cnt=0;
	

		System.out.print("수 n을 입력하시오");
		n = sc.nextInt();
			
			//i:1,2,3,4,5,6 ... n
			//
			for(int i=1;i<=n;i++){
				if(i%2==0){
				even_sum +=i; //even_sum = even_sum +i;  // i를 짝수로 설정했기 때문에 i를 더해도 짝수를 더하는거와 같음 굳이i+2안해도됨
				even_cnt++; //even_cnt = even_cnt +1;
				}else{
				 odd_sum+=i;
				 odd_cnt++;
				}
				
			}
			

System.out.println("1에서 "+n+"까지의 짝수의 합은 " +even_sum);
System.out.println("1에서 "+n+"까지의 짝수의 개수은 " +even_cnt);
System.out.println("1에서 "+n+"까지의 홀수의 합은 " +odd_sum);
System.out.println("1에서 "+n+"까지의 홀수의 개수은 " + odd_cnt);


	}
}
