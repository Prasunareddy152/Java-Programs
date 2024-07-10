import java.util.*;
class NextPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=num+1;
		while(true){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
				if(count==2){
		System.out.println(i);

		break;
				}
				i++;
		}
					
	}
}
