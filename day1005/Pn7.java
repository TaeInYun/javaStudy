
import java.util.Scanner;
class Pn7
  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 ,n2 ,n3 , min;

		System.out.print("첫번째 수를 입력하세요==>");
		n1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요==>");
		n2 = sc.nextInt();
		System.out.print("세번째 수를 입력하세요==>");
		n3 = sc.nextInt();
		
	
		if( n1 < n2 && n1 < n3){
			min = n1;
		}else if(n2<n1 && n2<n3){
			min = n2;
		}else{
			min = n3;
		}
		
		
		
		
		
		
		
		/*
		if(n1<n2){
			if(n1<n3){
				min = n1;
			}else{
				min = n3;
			}
		}else{
			if(n2<n3){
				min = n2;
			}else{
				min = n3;
			}
		}
		*/

		
		/*
		if(n1>n2){
			if(n2>n3) {
				min = n3;
			} else {
				min = n2;
			}
		}else{
			if(n1>n3) {
				min = n3;
			}else {
				min = n1;
			}
		}
		*/
		System.out.print("가장 작은 값은"+min+"입니다.");

	}
}
