class ForEachArray 
{
	public static void main(String[] args) 
	{
		int[]data = {1,2,3,4,5};
		for(int i:data){ //�迭�� ���� �ϳ��� ������ 
			System.out.println(i); // 1 2 3 4 5 �̷��� ���� �ϳ��� ������
			//System.out.println(data[i]); //2   1   2 2 2 data(1)=2 data(2)=1 data(1)=2 data(1)=2 data(1)=2 
			//for each �ݺ������� i���� ��Ҹ� �ϳ��� �����ɴϴ�. data[i]�� 1�� ������ [1]�ε����� ��
		}

		/*
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		*/
	}
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ForEachArray.main(ForEachArray.java:8)

		*/
