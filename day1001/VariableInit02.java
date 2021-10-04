class VariableInit02
{
	public static void main(String[] args) 
	{
		int sum;
		System.out.println(sum);
		int i =1;
		sum=sum +i;
		//위의 코드도 오류를 발생시킵니다.
		//sum 변수를 선언하기만 하고 아직 아무 값도 없는 상태이기 때문에 
		//연산을 수행시키기 위해서는 초기값을 설정해야 합니다.

	}
}


/*
VariableInit02.java:6: error: variable sum might not have been initialized
                System.out.println(sum);
                                   ^
1 error
*/