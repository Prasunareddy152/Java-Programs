import java.util.*;
class Fibonacci
{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int range=sc.nextInt();
	int a=0;
	int b=1;
	int sum=0;
	for(int i=1;i<=range;i++){
		System.out.print(" "+sum);
		a=b;
		b=sum;
		sum=a+b;
	}
}
}

