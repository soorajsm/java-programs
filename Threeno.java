

import java.util.*;
import java.lang.*;
import java.io.*;


class Threeno
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		long a,b,c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            if((a+b==c)||(b+c==a)||(a+c==b))
                System.out.println("YES");
            else
                System.out.println("NO");
    
        }
	}
}
