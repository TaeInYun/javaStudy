class RangeByte
{
	public static void main(String[] args) 
	{
		// 1byte �� 8bit�� �����˴ϴ�. 1bit�� ǥ���Ҽ� �ִ� ���� ������ 0,1 �ΰ��� �Դϴ�. 
		//2bit�� �ִٸ�
		// 0 0 0
		// 0 1 1
		// 1 0 2
		// 1 1 3

		// 1byte(8����bit)�߿� �� ���ʿ� �ִ� bit�� �������� ������� �Ǻ��ϴ� ��ȣ��Ʈ�� ����ϰ� ������ 7���� ��Ʈ�� ���ڸ� ǥ���մϴ�. ���� ǥ���� �� �ִ� ���� ������ ������ �����ϴ�.
		//����2��7�º��� ���2��7��-1���� -128~127

		byte data;
		data = -128;
		System.out.println(data);
		data =(byte)(data -1);
		System.out.println(data);  //underFlow ǥ���Ҽ� �ִ� �������� ��ġ�� ����÷ο�

		/*data = 127;
		System.out.println(data);
		data= (byte)(data+1);
		
		System.out.println(data);*/ // overFlow ǥ���Ҽ� �ִ� �ְ��� ��ġ�� �����÷ο�
	}
}

/*

C:\javaStudy\day0928>javac RangeByte.java

C:\javaStudy\day0928>java RangeByte
127
-128

*/