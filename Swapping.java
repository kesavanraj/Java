import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c;
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0 && i<s.length()-1)
			{
			c=s.charAt(i+1);
			System.out.print(c);
		}
			 if(i%2==1)
			{
				c=s.charAt(i-1);
			    System.out.print(c);
			}
			
	}
		if(s.length() % 2 == 1  )
		{
			System.out.println(s.charAt(s.length()-1));
		}
		

	}

}
