import java.util.*;
class ProfitPercentage  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sprice=sc.nextInt();
		int cprice=sc.nextInt();
		double pp=((sprice-cprice)*100)/cprice;
		System.out.println("Profit Percentage is:"+pp);
	}
}
