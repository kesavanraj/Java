import java.util.Scanner;

public class RepeatedNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]== a[j] && (i!=j))
				{
					System.out.println("Repeated Number:"+a[j]);
				}
				
			}
		}
		
	}

}
