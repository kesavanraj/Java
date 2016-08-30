import java.util.Scanner;

public class subset {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for (int i1 = 0; i1 < a.length; i1++) 
		{
			b[i1]=sc.nextInt();
		}
		int temp=0;
		for(int j=0;j<a.length;j++)
		{
			for(int j1=0;j1<b.length;j1++)
			{
				if(a[j]==b[j1])
				{
					
					temp=temp+1;
					
				}
				
			}
		}
		
		if(temp==b.length)
		{
			System.out.println("A is a subset of B");
		}
		else
		{
			System.out.println("A is not a subset of B");
		}
	}
}
