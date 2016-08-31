import java.util.Arrays;
import java.util.Scanner;

public class HeightFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Find the kth tallest position:");
		int k=sc.nextInt();
		System.out.println(a[n-k]);
	}

}
