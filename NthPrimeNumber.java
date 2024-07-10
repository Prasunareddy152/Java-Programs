import java.util.*;
class NthPrimeNumber
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int num=1;
		int primeCount=0;
		while(true){
			int count=0;
			for(int i=1;i<=num;i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==2){
				
				
				primeCount++;
				}

				if(primeCount==range){
					System.out.println(num);
					break;
					}
				num++;
				
		}
}}
