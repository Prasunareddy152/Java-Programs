import java.util.*;
class GCD
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int divident=sc.nextInt();
		int divisor=sc.nextInt();
		while(divisor!=0){
			 int  rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("GCD is:"+divident);

	}
}
