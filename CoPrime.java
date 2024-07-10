import java.util.*;
class TwistedPrime 
{
		static int isPrimeNumber(int num){
			boolean isPrime=true;
			int temp=num;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
			if(isprime==true && num>1){
				int rev=0;
				while(num!=0){
					int ld=num%10;
					rev=rev*10+ld;
					num=num/10;
				}
				int count=0;
				for(int j=1;j<=n/2;j++){
					if(temp%i==0){
						count++;
					}
				}
				if(count==2){
					System.out.println("Twisted pair");
				}
				else{
					Syste.out.println("Not a Twisted pair");
				}

	}
	public static void main(String args[]){
		scanner sc=new scanner(System.in);
		int num=sc.nextInt();
		isPrimeNumber();
	}
}
