/*
�迭�߿��� ���� ū �� ã��
1) ���� ū���� ã�� �����ϱ� ���� max��� ���� �����Ѵ�.
2) �迭�� ��ù��° ��Ҹ� �δ��� max��� ����.
3) �ݺ����� �̿��Ͽ� �迭�� ��Һ��� max�� ������ ���Ͽ�
	���ϴ� �迭�� ���� max���� �� ũ�ٸ� �׹迭�� ���� max��� ����.

*/

class MaxOfArray 
{
	public static void main(String[] args) 
	{
		int []arr={9,3,7,15,2};
		int max;
		max = arr[0];

		for(int i=1;i<arr.length;i++){ //�̹� max�ȿ� a0��°�� �����Ƿ� i��1���� �����
			if(arr[i] > max){
				max = arr[i];  //i �� 5�϶� Ż��
			}
			
		}
		System.out.println("�迭�߿� ���� ū����"+ max);
	}
}
