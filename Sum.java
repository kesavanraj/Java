import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,a=0;
while(n>0)
{
a=n%10;
sum=sum+a;
n=n/10;
}
System.out.print(sum);
}
}
