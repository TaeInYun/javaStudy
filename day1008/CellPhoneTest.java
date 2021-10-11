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
	 System.out.print("전원을 시작합니다.");
	 power = true;
	
	 }
  else{
	 System.out.print("전원을 시작합니다.");
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
		CellPhone c; //person 자료형 person p = new person()
		c = new CellPhone(); //new 를 해야 메모리가 잡힘
		
		
			System.out.printf("핸드폰의 모델명를 입력하시오");
				c.name = sc.next();
			System.out.printf("핸드폰의 제조회사를 입력하시오");
			   c.corp = sc.next();
 
			System.out.printf("핸드폰의 색상을 입력하시오");
			    c.color = sc.next();

		    System.out.printf("핸드폰의 카메라 여부를 입력하시오 on/off");
			   c.cam = sc.next();

			/*System.out.printf("핸드폰의 상태를 입력하시오 on/off");
			   c.power = sc.next();
			   */


 
  System.out.printf( "핸드폰모델명%s핸드폰제조회사%s핸드폰 색상은%s 카메라 여부는%s",c.name,c.corp,c.color,c.cam );
  System.out.println(c.power);



	}
}
