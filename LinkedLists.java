import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Character> li= new LinkedList<Character>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			li.add(sc.next().charAt(0));
		}
		String s="";
		for(int i=0;i<n;i++)
		{
			s=s+li.get(i);
		}
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Characters in LinkedList forms palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

	
}
