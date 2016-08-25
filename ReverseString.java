import java.util.*;
public class ReverseString
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s=sc.next();
StringBuffer sb=new StringBuffer();
String rev=sb.reverse().toString();
System.out.print(rev);
for(int i=0;i<rev.length();i++)
{
char c=rev.charAt(i);
if(rev.contains("a" || "e" || "i" || "o" || "u" || "A" || "E" || "I" || "O" || "U")
{
String o=Integer.valueOf(c);
o.reverse(c,""");
}
else
{
System.out.print(c);
}
}}
}
