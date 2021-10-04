
class Pn12 
{
	public static void main(String[] args) 
	{
		int count=0;

		for(int i =2 ;i<100; i++){ 
			for(int k =2;k<100 ;i++){
				if( i%k == 0){
					count++;
				}
				
			}
		
			if(count ==0){
			System.out.print(i +" ");
			}


		}
		
	}
}
