import java.util.*;
class Xyleom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum1=num%10;
		int temp=num/10;
		int sum2=0;
		while(temp>9){
			int ld=temp%10;
			sum2=sum2+ld;
			temp=temp/10;
		}
		sum1=sum1+temp;
		if(sum1==sum2){
		System.out.println("xyleom Number");
		}
		else{
			System.out.println("phleom Number");
		}
	}
}
