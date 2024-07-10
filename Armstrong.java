import java.util.*;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		 int temp1=num;
		int sum=0;
		while(temp1!=0){
			int ld=temp1%10;
			int prod=1;
			for(int i=1;i<=count;i++){
				prod=prod*ld;
			}
			sum=sum+prod;
			temp1=temp1/10;
		}
		if(sum==num){

		System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not an Armstrong Number");
		}
	}
}
