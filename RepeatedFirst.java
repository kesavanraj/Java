import java.util.HashSet;
import java.util.Scanner;

public class RepeatedFirst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=-1;
		HashSet<Integer> hs=new HashSet<>();
        for (int i=n-1; i>=0 ; i--) {
			if(hs.contains(a[i]))
			{
				min=i;
			}
			else
			{
				hs.add(a[i]);
			}
		}
        if(min!=-1)
        {
        	System.out.println("the 1st repeating number:"+a[min]);
        }
        else
        {
        	System.out.println("No repeating numbers");
        }
	}

}
