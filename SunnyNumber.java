import java.util.*;
class SunnyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=num+1;
		
	double nextSquare=Math.sqrt(a);
		if(nextSquare==(int)nextSquare){
			System.out.println("Sunny number");}
			else{


		System.out.println("Not a Sunny Number");
			}
	}
}
//for(int i=1;i<=(num+1);i++){
//if(i*i==num+1){
//S.o.pln("sunny");}
//else
//{
//S.o.pln("No");}