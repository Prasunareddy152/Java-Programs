import java.util.*;
class BouncyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sort=0;
		for(int i=1;i<=9;i++){
			int count=0;
			int temp=num;
			boolean isPresent=false;
		while(temp!=0){
			int ld=temp%10;
				if(i==ld){
					count++;
					isPresent=true;
				}
			
			temp=temp/10;
		}
			if(isPresent==true){
			for(int j=1;j<=count;j++){
				sort=sort*10+i;
			}
			}
		}
		int rev=0;
		int temp1=sort;
		while(temp1!=0){
			int ld=temp1%10;
			rev=rev*10+ld;
			temp1=temp1/10;
		}

		if(num==rev || num==sort){

			
		System.out.println("N0");
		}
		else{
			System.out.println("Yes");
		}
	}
}
