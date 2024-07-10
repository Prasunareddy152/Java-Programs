
import java.util.*;
class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int prod=1;
		while(num!=0){
			int ld=num%10;
			prod=prod*ld;
			num=num/10;
		}
		if(prod==0){
		System.out.println("Duck number");
			}
		else{
			System.out.println("Not a Duck Number");
		}
	
	}
}
