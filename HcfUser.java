	import java.util.*;

	public class HcfUser
	{
	    public static void main(String args[])
	    {
	        int a, b, x, y, t, hcf;
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
	      hcf=a;
	     
	      
	        System.out.print("HCF = " +hcf);
	    }
	}
