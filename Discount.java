import java.util.Scanner;
class Discount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int discount=sc.nextInt();
		int markedprice=sc.nextInt();
		double finalprice=((100-discount)*markedprice)/100;
		System.out.println("Final Price is:"+finalprice);
	}
}
