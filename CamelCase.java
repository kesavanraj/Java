import java.util.Scanner;

public class CamelCase
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
char a=s.charAt(0);
if(Character.isLowerCase(a))
{
	a=Character.toUpperCase(a);
}
else if(Character.isUpperCase(a))
{
	a=Character.toLowerCase(a);
}
System.out.print(a);
for(int i=1;i<s.length();i++)
{
	System.out.print(s.charAt(i));
}
}
}
