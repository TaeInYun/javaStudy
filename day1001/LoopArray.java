

class LoopArray
{
	public static void main(String[] args) 
	{
		//1~45 까지 숫자 6개를 말해봅니다.
		int[]lotto = {4,11,19,26,27,43}; //21

		System.out.println("건우가 추천하는 이번주 로또 번호");
		
		//for(int i=0;i<6;i++){ //lotto.length 길이를 알수 있음
			for(int i=0;i<lotto.length;i++){
			System.out.print(lotto[i]+" ");
		 }
		
		
		
		
		/*
		System.out.print(lotto[0]+" ");
		System.out.print(lotto[1]+" ");
		System.out.print(lotto[2]+" ");
		System.out.print(lotto[3]+" ");
		System.out.print(lotto[4]+" ");
		System.out.print(lotto[5]+" ");
		*/
	}
}
