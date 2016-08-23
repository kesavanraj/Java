	import java.util.*;

	public class Lcm
	{
	    public static void main(String args[])
	    {
	        int a, b, x, y, t, lcm;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.println("Enter Two Number : ");
	        x = scan.nextInt();
	        y = scan.nextInt();
			
	        a = x;
	        b = y;
			
	      while(b !=0)
	      {
	    	  t=b;
	    	  b=a%b;
	    	  a=t;
	      }
	      lcm=x*y/a;
	        System.out.print("\nLCM = " +lcm);
	    }
	}

