import java.util.Random;
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String[]names = {"김수연","김시아","김지현","노유나","박성미","박지예","유하림","윤서우","윤태인",
		"이건우","임상진","임하연","전세영","정자영","최현호"};

		for(int i=0;i<100;i++){
			System.out.print(names[i%names.length]+"\b\b\b");

			try{
			Thread.sleep(100);  //대기시간 1000 당 1초
			}catch(Exception e){}

		}
		Random rand = new Random();
		int n =rand.nextInt(); //난수 음수양수 둘다
		n = n >>> 1;  //무조건 양수 나옴
		n = n%15;
		System.out.println("*** 당첨자 ***");
		System.out.println(names[n]);

	}
}
