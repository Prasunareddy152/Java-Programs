import java.util.*;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int i=1;
		while(true){
			if((num1*i)%num2==0){
				System.out.println("LCM is:"+num1*i);
				break;
			
		}
		i++;

		}
	}
}
