import java.util.*;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0){
			int prod=1;
			int ld=num%10;
			for(int i=1;i<=ld;i++){
				prod=prod*i;
				}
				sum=sum+prod;
				num=num/10;
		}
		if(sum==temp){
		System.out.println("Strong Number");}
		else{
			System.out.println("Not a strong Number");
		}
	}
	
}
