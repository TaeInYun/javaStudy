
class Pn12 
{
	public static void main(String[] args) 
	{
		// int count=0;
		//7  i:2,3,~6 7나누기 i 했을때 나머지 0이 안나오면 소수  k:2~i-1 자기자신으로 나누면 나머지 0되니까 제외
		for(int i =2 ;i<100; i++){ 
			int count=0; // 위치 중요 2하고 초기화 3하고 초기화 4하고 초기화 5하고 초기화 이렇게 가야지 아래 식이 원활해짐
			for(int k =2;k<i ;k++){
				if( i%k == 0){ //나머지 0이 나오면
					count++;  //카운트 증가 약수의 개수 (단 1,자기자신 제외)
				}
				
			}
		
			if(count ==0){ //카운트가 0인 숫자만 (1과 자기자신 제외하고 약수가 없으면)
			System.out.print(i +" "); //출력함
			}


		}
		
	}
}
