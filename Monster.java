/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Monster
{
	public static void main (String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        long a=sc.nextLong();
	         long b=sc.nextLong();
	          long c=sc.nextLong();
	       
	          if(b>c)
	            System.out.println("1");
	          else
	            System.out.println("0");
	    
	    }
	}
}
