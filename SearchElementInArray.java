import java.util.*;
class SearchElementInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int numberToBeSearch=sc.nextInt();
		int[] a={1,2,3,4,5};
		for(int i=0;i<a.length;i++){
			if(a[i]==numberToBeSearch){
				System.out.println("Number is Present");
				break;
			}
		}

	}
}
