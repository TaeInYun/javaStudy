//연습 사용자 한테 문자열을 입력받아 맨 첫번째 문자를 출력 해 봅니다.

import java.util.Scanner;
class  Q1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.println("단어를 입력하세요");
		word = sc.next();

	    //char fisrt;
		//first = word charAt(0);
		char first = word.charAt(0);
		System.out.println("첫번째에 있는 문자는 "+first+" 입니다.");
        //System.out.println("첫번째에 있는 문자는 "+word.charAt(0)+" 입니다.");

		//String first =word.charAt(0)+"";
		//String first = word.substring(0,1);  // 만마지막 은 뺌 substring 활용하면 2개이상도 가능
		//System.out.println("첫번째에 있는 문자는 "+first+" 입니다.");

	}
}

//질문, string으로 저장하고 싶어요!