import java.util.*;

class MyUtil
{
	//정수형배열을 매개변수로 전달받아 배열의 요소를 모두출력하는메소들 정의
	boolean SetArray(int []c, int[]d){ //  자료형 선언주의
		 boolean flag = true;
       int right=0, wrong=0 ;

	   for(int i=0;i<d.length;i++){
		if(c[i]==d[i]){
			right++;
		}
	   else{
		 wrong++;
	   }
	  }


	   if(right>=7){
		flag = true;
	   }

		System.out.print(right);
		System.out.print(wrong);
	   
       return flag;
	} 
}




class  Pro2
{
	public static void main(String[] args) 
	{
		int []a = new int[10];
		int []b = {1,2,3,4,1,2,3,4,1,2};
		boolean flag;
		Scanner sc = new Scanner(System.in);
		for(int i =0;b.length;i++){
			System.out.printf("%d번답을 입력하세요:",(i+1));
			a[i]=sc.nextInt();
		}
		
		MyUtil net= new MyUtil();
		net.SetArray(a);
		


	}
}
