class DecimalOctalHexaBinary
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 014;  //8���� ǥ��  �տ� 0 �߰�
		int c = 0xc;   //16���� ǥ�� �տ� 0x �߰�
		int d = 0b1100; //2����ǥ��  �տ� 0b �߰�

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	    System.out.println(d);
	}
}

/*
8����  10����   16����  2

0    0     0		0
1    1     1		1
2    2     2		10
3    3		3		11	
4    4		4		100	
5    5		5		101
6    6		6		110
7    7		7		111
10   8		8		1000
11   9		9		1001
12   10	A			1010
13   11	B			1011
14   12    C		1100
	 13	    D		1101
	 14		E		1110
	 15		F		1111
     16		10
	 17		11	

*/