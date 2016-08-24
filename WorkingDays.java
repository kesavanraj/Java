import java.util.*;
public class WorkingDays
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s=sc.next();
String op;
switch(s)
{
case "Sunday":
op="Holiday";
break;
default:
op="Working Day";
}
System.out.print(op);
}
