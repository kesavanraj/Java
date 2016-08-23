import java.util.*;
public class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

         int[] feb = new int[n];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < n; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< n; i++){
                 System.out.print(feb[i] + " ");
         }
    }
}
