/*

��� Person
	�Ӽ�
		�̸� String name "ȫ�浿"
		���� int age       20
		����  char gender  '��', '��'


	���� (�޼ҵ�)
		�Դ´�  void eat(String food)
		�ܴ�    void sleep()

*/

class Person
{
	String name;
	int age;
	char gender;

	void eat(String food){
		//������ ���� 20�� ȫ�浿��  ������ �Ծ��
		System.out.printf("������%c�� %d�� %s�� %s�� �Ծ��\n",gender,age,name,food);
	}

	void sleep(){
		// ������ ���� 20�� ȫ�浿�� ��~��~�ڰ��־��
		System.out.printf("������ %c��%d��%s�� ��~�� �ڰ� �־��\n",gender,age,name);
	}
}



class PersonTest
{
	public static void main(String[] args) 
	{
		Person p; //person �ڷ��� person p = new person
		p = new Person(); //new �� �ؾ� �޸𸮰� ����
		p.name = "����ȣ";
		p.age = 26;
		p.gender = '��';
		p.eat("ġ��");
		p.sleep();


	}
}
