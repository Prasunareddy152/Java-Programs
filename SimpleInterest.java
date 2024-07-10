import java.util.*;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int principleamount=sc.nextInt();
		int time=sc.nextInt();
		int rateofinterest=sc.nextInt();
		double simpleinterest=(principleamount*time*rateofinterest)/100;
		System.out.println("Simple Interest is:"+simpleinterest);
	}
}
