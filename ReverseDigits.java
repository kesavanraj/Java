import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		String sb=new StringBuffer(s).reverse().toString();
		for(int i=0;i<sb.length();i++)
		{
		System.out.print(sb.charAt(i));
		}
		}
		}
