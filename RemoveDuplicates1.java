  
import java.util.*;
class RemoveDuplicates1
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=sc.nextInt();
		}
		int count=0;
				for(int i=0;i<a.length;i++){
					boolean isElementPresent=false;
					for(int j=0;j<i;j++){
						if(a[j]==a[i]){
							isElementPresent=true;
							break;
						}
					}
				if(isElementPresent==false){
					count++;
				}
				}
				int[] b = new int[count];
				int index = 0;
				for (int i = 0; i < a.length; i++) {
				boolean isElementPresent = false;
				for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    isElementPresent = true;
                    break;
                }
            }
            if (!isElementPresent) {
                b[index++] = a[i];
            }
        }
				
		for (int i=0;i<b.length ;i++ )
		{

			System.out.print(b[i]+" ");
		}
		
	}
}
