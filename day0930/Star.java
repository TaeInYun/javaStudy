/*사용자한테 생월과 생일을 입력받아
별자리를 판별하여 출력하는 프로그램을 작성 해 봅니다.

윤태인==>윤태인
생월==> 2
생일==> 9
윤태인님의 별자리는 물병자리입니다.
*/


import java.util.Scanner;
class Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int month, day;
        System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("생월을 입력하시오");
		month = sc.nextInt();
		System.out.println("생일을 입력하시오");
		day = sc.nextInt();
		String name2="";
		


		if(month <1|| month>12 || day<1 || day>31){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(month ==2 && day>28 && day<32){
			System.out.println("입력 범위를 넘었습니다.");
		}
		else{
			switch(month){
			case 1: if(day >=20){
				name2 ="물병자리";
			} else{
				name2 ="염소자리";
			}
			break;
		    case 2:  if(day >=19){
				name2 = "물고기자리";
			} else{
				name2 = "물병자리";
			}     
			break;
			case 3: if(day >=21){
				name2 = "양자리";
			} else{
				name2 ="물고기자리";
			} 
			break;
			case 4: if(day >=20){
				name2 ="황소자리";
			} else{
				name2 ="양자리";
			} 
			break;
			case 5: if(day >=21){
				name2 ="쌍둥이자리";
			} else{
				name2 ="황소자리";
			} 
			break;
			case 6: if(day >=22){
				name2 ="게자리";
			} else{
				name2 ="쌍둥이자리";
			} 
			break;
			case 7:if(day >=23){
				name2 ="사자자리";
			} else{
				name2 ="게자리";
			} 
			break;
			case 8:if(day >=23){
				name2 ="처녀자리";
			} else{
				name2 ="사자자리";
			} 
			break;
			case 9:if(day >=24){
				name2 ="천장자리";
			} else{
				name2 ="처녀자리";
			} 
			break;
			case 10:if(day >=23){
				name2 ="전갈자리";
			} else{
				name2 ="천장자리";
			} 
			break;
			case 11:if(day >=23){
				name2 ="사수자리";
			} else{
				name2 ="전갈자리";
			} 
			break;
			case 12:if(day >=25){
				name2 ="염소자리";
			} else{
				name2 ="사수자리";
			} 


			}
		  System.out.print(name+"님의 별자리는" +name2+" 입니다.");
	

		
	}
 }
}