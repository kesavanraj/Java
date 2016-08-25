import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sub=sc.next();
		if(s.contains(sub))
		{
			System.out.println("sub is substring of s");
		}
		else
		{
			System.out.println("not a substring");
		}

	}

}
