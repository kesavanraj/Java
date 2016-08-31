import java.util.Scanner;

public class StringMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int n=Integer.valueOf(s);
		int n1=Integer.valueOf(s1);
		int mul=n*n1;
		System.out.println(mul);

	}

}
