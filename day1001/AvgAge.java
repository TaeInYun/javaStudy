class AvgAge
{
	public static void main(String[] args) 
	{
		int []age ={27,28,26,29,28};

		//5명의 평균나이를 계산하여 출력해 봅니다.
		int tot=0;
		for(int i=0; i<age.length ; i++ ){
		  tot+=age[i];     	//tot =tot +age[i];
		}

		double avg = (double)tot/age.length;
		System.out.println("평균나이"+ avg); //실수화
	}
}


