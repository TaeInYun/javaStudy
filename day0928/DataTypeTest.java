class DataTypeTest
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;  // = 대입연산자 순서중요함 오른쪽에 있는 값을 왼쪽에 넣어라
		System.out.println("임상진의 나이:"+age+"살입니다.");


		//double height;
		float height;
		//height = 173.8;
		//height = 173.8f;  // 실수값을 float 변수에 저장하기 위해서는 접미사f
        height = (float)173.8;	// 자료형변환을 하여 저장할 수 있어요
		System.out.println("임상진의 키:"+height);


        char gender;
		gender = 'M';  //하나의 변수를 저장하기 위해서 홋따움표 사용
		//gender = "M";  //쌍따옴표로 묶으면 문자열(string)으로 취급하기 때문에 char에 저장할 수 없어요!
		System.out.println("임상진은 성별은:"+gender);

       boolean isVaccine;
	   isVaccine = true;
	   System.out.println("임상진의 1차백신 접종여부:" +isVaccine);
	}
}


/*
DataTypeTest.java:22: error: incompatible types: String cannot be converted to char
                gender = "M";  //하나의 변수를 저장하기 위해서 홋따움표 사용 //string으로 취급함 
                         ^
1 error
*/

/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
                height = 173.8;
                         ^
1 error
*/