import java.util.*;
class TwistedPrime 
{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
			int count=0;
			int temp=num;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==2){
				int rev=0;
				while(num!=0){
					int ld=num%10;
					rev=rev*10+ld;
					num=num/10;
				}
				count=0;
				for(int j=1;j<=temp/2;j++){
					if(temp%j==0){
						count++;
					}
				}
				if(count==2){
					System.out.println("Twisted pair");
				}
				else{
					System.out.println("Not a Twisted pair");
				}
			}
			else{
				System.out.println("Not a twisted pair");
			}

	
	
	
	
	}
}
