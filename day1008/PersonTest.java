/*

사람 Person
	속성
		이름 String name "홍길동"
		나이 int age       20
		성별  char gender  '남', '여'


	동작 (메소드)
		먹는다  void eat(String food)
		잔다    void sleep()

*/

class Person
{
	String name;
	int age;
	char gender;

	void eat(String food){
		//성별인 남인 20살 홍길동이  우유를 먹어요
		System.out.printf("성별이%c인 %d살 %s가 %s를 먹어요\n",gender,age,name,food);
	}

	void sleep(){
		// 성별이 남인 20살 홍길동이 쿨~쿨~자고있어요
		System.out.printf("성별이 %c인%d살%s가 쿨~쿨 자고 있어요\n",gender,age,name);
	}
}



class PersonTest
{
	public static void main(String[] args) 
	{
		Person p; //person 자료형 person p = new person
		p = new Person(); //new 를 해야 메모리가 잡힘
		p.name = "최현호";
		p.age = 26;
		p.gender = '남';
		p.eat("치맥");
		p.sleep();


	}
}
