import java.util.*;
class Prime1To100 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		for(int i=2;i<=range;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
				if(count==2){

		System.out.println(i);
				}
			}
	}
}
