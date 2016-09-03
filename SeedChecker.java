import java.util.Scanner;

public class SeedChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int a=0;
		int seed=n;
		while(n>0)
		{
			a=n%10;
			seed=seed*a;
			n=n/10;
		}
		System.out.println("seed of "+x+":"+seed);
	}

}
