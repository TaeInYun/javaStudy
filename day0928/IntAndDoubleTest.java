class  IntAndDoubleTest
{
	public static void main(String[] args) 
	{
		//정수와 정수를 연산하면 결과가 정수가 됩니다
		//만약 정수와 정수를 연산하여 실수값을 갖기를 원한다면
		//정수중 하나를 실수로 형변환하여 연산해야 합니다.

		int a=5;
		int b=2; //초기값을 넣는다
		
		double result ;
		//result = a/b;
		result =(double)a/b;  // 형변환하여 실수값 2.5 가 나오도록 프로그램 수정
		System.out.println("나누기 결과:"+ result);

	}
}
/*
C:\javaStudy\day0928>java IntAndDoubleTest
나누기 결과:2.0

C:\javaStudy\day0928>javac IntAndDoubleTest.java

C:\javaStudy\day0928>java IntAndDoubleTest
나누기 결과:2.5
*/