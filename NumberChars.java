import java.util.Scanner;

public class NumberChars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=new String[s.length()];
		int n1[]=new int[s.length()];
		char c=0,d=0;
		for (int i = 0; i < s.length()-2; i++) {
			 c=s.charAt(i);
			 d=s.charAt(i+1);
			 if(Character.isDigit(c) && Character.isDigit(d))
			 {
					String s2=String.valueOf(c);
					String s3=String.valueOf(d);
					String s4=s2+s3;
					int n=Integer.valueOf(s4);
					n1[i]=n; 
					i++;
			 }
			 else if(Character.isDigit(c))
			{
				int n=Integer.valueOf(c);
				n1[i]=n-48;
			}
			 else if(Character.isAlphabetic(c))
			{
				c=s.charAt(i);
				s1[i]=c+"";
				
			}
		
		}
		char f=s.charAt(s.length()-1);
		int x=Integer.valueOf(f);
		 n1[s.length()-1]=x-48;
		 s1[s.length()-2]=s.charAt(s.length()-2)+"";
          for(int i=0;i<n1.length-1;i++)
          {
        	  if(n1[i+1]>0 && s1[i]!=null)
        	  {
        		  char e=s1[i].charAt(0);
        		  for(int j=0;j<n1[i+1];j++)
        		  {
        			  System.out.print(e);
        		  }
        	  }
          }
           
	
		 }
	}


