// 연습 사용자한테 문자열을 입력 받아 입력한 문자열에 소문자 'o' 의 수를 파악하여 출력하는 프로그램을 작성해 봅니다.

import java.util.Scanner;
class Findo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하시오");
		data = sc.next();

		
		char ch;
		int cnt = 0;

        for(int i=0 ; i < data.length() ;i=i+1 ){ //lenght는 =을 빼야함
			ch = data.charAt(i);
		    //System.out.println(ch);
			if(ch == 'o')
				cnt=cnt +1;
		}
		System.out.println("소문자 o의 개수는" +cnt+" 입니다.");

	}
}
