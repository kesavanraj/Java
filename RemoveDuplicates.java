import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lh = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lh.add(str.charAt(i));
        
        for(Character ch : lh)
            System.out.print(ch);
    }
  
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        RemoveDuplicates r = new RemoveDuplicates();
        r.removeDuplicates(str);
    }

}
