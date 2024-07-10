//Sum of proper factors is equal to the number
import java.util.*;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for (int i=1;i<temp ;i++ )
		{
			if(temp%i==0){
				sum=sum+i;

		}
		}
		if(sum==num){

		System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not a perfect Number");
		}
	}
}
