import
class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		int i=1;
		int sum = 0;
		
		//for(i=1 ; i<=3;i++){
		 for(i=1 ; i<=100;i++){
		   sum +=i;
		}
		/*
		sum +=i; //1

		i++; //2
		sum+=i; //3

		i++;//3
		sum+=i; //6
		*/

		System.out.println("i:"+i);
		System.out.println("sum:"+sum);

	}
}
