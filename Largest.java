import java.util.*;
class Largest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int largest=0;
		while(num!=0){
			int ld=num%10;
			if(ld>largest){
				largest=ld;
			}
			num=num/10;
		}
		System.out.println("Largest digit in the given number is:"largest);
	}
}
