class AvgAge
{
	public static void main(String[] args) 
	{
		int []age ={27,28,26,29,28};

		//5���� ��ճ��̸� ����Ͽ� ����� ���ϴ�.
		int tot=0;
		for(int i=0; i<age.length ; i++ ){
		  tot+=age[i];     	//tot =tot +age[i];
		}

		double avg = (double)tot/age.length;
		System.out.println("��ճ���"+ avg); //�Ǽ�ȭ
	}
}

