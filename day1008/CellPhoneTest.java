import java.util.Scanner;

class CellPhone
{
	String name;
	String corp;
	String color;
	String cam;
	boolean power = true; 


void power(){
  if(true)
   { 
	 System.out.print("������ �����մϴ�.");
	 power = true;
	
	 }
  else{
	 System.out.print("������ �����մϴ�.");
	power = false;
 }
    return ;
}

	
}



class CellPhoneTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CellPhone c; //person �ڷ��� person p = new person()
		c = new CellPhone(); //new �� �ؾ� �޸𸮰� ����
		
		
			System.out.printf("�ڵ����� �𵨸� �Է��Ͻÿ�");
				c.name = sc.next();
			System.out.printf("�ڵ����� ����ȸ�縦 �Է��Ͻÿ�");
			   c.corp = sc.next();
 
			System.out.printf("�ڵ����� ������ �Է��Ͻÿ�");
			    c.color = sc.next();

		    System.out.printf("�ڵ����� ī�޶� ���θ� �Է��Ͻÿ� on/off");
			   c.cam = sc.next();

			/*System.out.printf("�ڵ����� ���¸� �Է��Ͻÿ� on/off");
			   c.power = sc.next();
			   */


 
  System.out.printf( "�ڵ����𵨸�%s�ڵ�������ȸ��%s�ڵ��� ������%s ī�޶� ���δ�%s",c.name,c.corp,c.color,c.cam );
  System.out.println(c.power);



	}
}
