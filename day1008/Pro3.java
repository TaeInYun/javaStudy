import java.util.Scanner;

class MyUtil
{
   
        int right=0, wrong=0 ;
		int []a = new int[10];
		int []b = {1,2,3,4,1,2,3,4,1,2};
		Scanner sc = new Scanner(System.in);
        boolean flag = true;
void SetArray(int []a, int[]b){
		for(int i =0;i<a.length;i++){
			System.out.printf("%d번답을 입력하세요:",(i+1));
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
		if(a[i]==b[i]){
			right++;
		}
	   else{
		 wrong++;
	   }
	  }


  }

 boolean pass(boolean true2){
		   if(right>=7){
			flag = true;
		   }else return false;
        return flag;
 }

int rightAnswers()	{	
	return right;	
	}

int wrongAnswers()	{	
	return wrong;
	}

}
		  
      
class  Pro2
{
	public static void main(String[] args) 
	{
		
		
		int Max = 10;
		boolean true2;

		MyUtil net= new MyUtil();
		net.pass(true2);
		

	
	}
}
