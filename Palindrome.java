import java.util.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s=sc.next();
StringBuffer sb=new StringBuffer(s);
String rev=sb.reverse().toString();
if(s.equals(rev))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}
