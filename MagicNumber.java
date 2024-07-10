import java.util.*;
class MagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>9){
			int sum=0;
			while(num!=0){
				int ld=num%10;
				sum=sum+ld;
				num=num/10;
			}
		
			num=sum;
		}
			if(num==1)
			{
		System.out.println("Magic Number");
			}
			else{
				System.out.println("Not a Magic Number");
			}
	}
}
//sum of the digits until the number becomes single digit is equal to 1.
//1234
//1+2+3+4=10
//1+0=1
