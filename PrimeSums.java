import java.util.Scanner;

class PrimeSums {
	public static void main(String args[])
	{
		System.out.print("Enter Range:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int sum=0;
		for(int i=2;i<r;i++)
		{
			int f=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					f=1;
			}
			if(f==0)
			{
				//System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println("Sum = "+sum);
	}
}
