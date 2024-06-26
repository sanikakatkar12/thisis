import java.util.*;
class Test
{
	public static void main(String args[])
	{
		int n,i;
		System.out.print("Enter a number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i = 1; i <= 10;i++)
		{
			System.out.println( n+ "*" +i+ "=" +n*i);
		}
	}
}
		