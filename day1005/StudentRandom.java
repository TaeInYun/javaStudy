import java.util.Random;
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String[]names = {"�����","��þ�","������","������","�ڼ���","������","���ϸ�","������","������",
		"�̰ǿ�","�ӻ���","���Ͽ�","������","���ڿ�","����ȣ"};

		for(int i=0;i<100;i++){
			System.out.print(names[i%names.length]+"\b\b\b");

			try{
			Thread.sleep(100);  //���ð� 1000 �� 1��
			}catch(Exception e){}

		}
		Random rand = new Random();
		int n =rand.nextInt(); //���� ������� �Ѵ�
		n = n >>> 1;  //������ ��� ����
		n = n%15;
		System.out.println("*** ��÷�� ***");
		System.out.println(names[n]);

	}
}
