import java.util.*;
class multiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int range=sc.nextInt();
		for(int i=1;i<=range;i++){
			int res=num*i;


		System.out.println(num+"*"+i+"="+res);}
	}
}
