class  NotDefine
{
	public static void main(String[] args) 
	{
		//String name; // 선언을 안하면
		name = "최현호"; // 이거 못씀
		System.out.println("이름은"+name);
	}
}


/*
C:\javaStudy\day0928>javac NotDefine.java
NotDefine.java:6: error: cannot find symbol
                name = "최현호"; // 이거 못씀
                ^
  symbol:   variable name 변수 선언안하면 못씀
  location: class NotDefine
NotDefine.java:7: error: cannot find symbol
                System.out.println("이름은"+name);
                                         ^
  symbol:   variable name
  location: class NotDefine
2 errors

/*