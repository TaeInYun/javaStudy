class IncreamentDrCreament

{
	public static void main(String[] args) 
	{
		int i = 5; 
		int j = 5;
		i++;  //i= i+1
		++j;  //j= j+1
		System.out.println(i);
		System.out.println(j);

		System.out.println("----------------------------------------------");
		// a++와 a+1은 다릅니다!
		int a = 10;
		int b = 10;
		System.out.println(a+1);  // a에 1을 더함
		System.out.println(b++);  // b에 1을 더해서 b에 대입
        System.out.println("----------------------------------------------");
		System.out.println(a);
		System.out.println(b);
        System.out.println("----------------------------------------------");

		int n =5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);
		System.out.println("----------------------------------------------");

		i =5;   //i6 j6 a6 b5 i와j는 증감연산자를 받아서 1증가 a는증감연산자가 앞에 있어서 1증가 이 값이 a 대입 b 증감연산자는 뒤에 있어서 그냥 j 값이 b에 대입 
		j =5;
		a = ++i;
		b= j++;
		System.out.println("i"+i);
		System.out.println("j"+j);
		System.out.println("a"+a);
		System.out.println("b"+b);

	   System.out.println("----------------------------------------------");

	   i = 5;
	   j = 5;
	   int k =5;
	   System.out.println(++i);  //6  명령문 임
	   System.out.println(j++);  //5  명령문 임
	   System.out.println(k+1);  //6
	   System.out.println(i);  //6
	   System.out.println(j);  //6
	   System.out.println(k);  //5

	}
}
