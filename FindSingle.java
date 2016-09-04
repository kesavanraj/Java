import java.util.*;

public class FindSingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		String m;
		int cm9=0,cm8=0,cm7=0,cm6=0,cm5=0,cm4=0,cm3=0,cm2=0,cm1=0,c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		int output=0;
		List<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			li.add(sc.nextInt());
		}
		int k=0;
		for(int j:li)
		{ 
			m=String.valueOf(j);
			s[k]=m;
			k++;
		//System.out.println(i);
		}
		for(int i=0;i<n;i++)
		{
			switch(s[i])
			{
			case "-9":
				cm9++;
				break;
			case "-8":
				cm8++;
				break;
			case "-7":
				cm7++;
				break;
			case "-6":
				cm6++;
				break;
			case "-5":
				cm5++;
				break;
			case "-4":
				cm4++;
				break;
			case "-3":
				cm3++;
				break;
			case "-2":
				cm2++;
				break;
			case "-1":
				cm1++;
				break;
			case "0":
				c0++;
				break;
			case "1":
				c1++;
				break;
			case "2":
				c2++;
				break;
			case "3":
				c3++;
				break;
			case "4":
				c4++;
				break;
			case "5":
				c5++;
				break;
			case "6":
				c6++;
				break;
			case "7":
				c7++;
				break;
			case "8":
				c8++;
				break;
			case "9":
				c9++;
				break;
			}
		}
		if(cm9 == 1)
		{
			output=-9;
		}
		if(cm8 == 1)
		{
			output=-8;
		}
		if(cm7 == 1)
		{
			output=-7;
		}
		if(cm6 == 1)
		{
			output=-6;
		}
		if(cm5 == 1)
		{
			output=-5;
		}
		if(cm4== 1)
		{
			output=-4;
		}
		if(cm3 == 1)
		{
			output=-3;
		}
		if(cm2 == 1)
		{
			output=-2;
		}
		if(cm1 == 1)
		{
			output=-1;
		}
		if(c0 == 1)
		{
			output=0;
		}
		if(c1 == 1)
		{
			output=1;
		}
		if(c2 == 1)
		{
			output=2;
		}
		if(c3 == 1)
		{
			output=3;
		}
		if(c4 == 1)
		{
			output=4;
		}
		if(c5 == 1)
		{
			output=5;
		}
		if(c6 == 1)
		{
			output=6;
		}
		if(c7 == 1)
		{
			output=8;
		}
		if(c8 == 1)
		{
			output=8;
		}
		if(c9 == 1)
		{
			output=9;
		}
		System.out.println(output);
		
	}

}
