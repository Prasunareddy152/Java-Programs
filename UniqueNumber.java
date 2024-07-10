import java.util.*;
class UniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp1=num;
		boolean isUnique=true;
			while(num>9){
				int ld=num%10;
				num=num/10;
				int temp=num;
				while(temp!=0){
					if(ld==(temp%10)){
						isUnique=false;
						break;
					}
					temp=temp/10;
				}
			}
		
			if(isUnique==true && temp1>0){
				System.out.println("Unique Number");
			}
			else{
				System.out.println("Not an Unique Number");
			}
				
			
				


		}
	
	
}
