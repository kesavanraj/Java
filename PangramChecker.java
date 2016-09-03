import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int temp=0;
		char c[]=s.toCharArray();
		String s1="abcdefghijklmnopqrstuvwxyz";
		char d[]=s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if(i==j)
				{
					temp++;
				}
			}
		}
		if(temp==s1.length())
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
	}

}
