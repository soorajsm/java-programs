// public class practice {
    // public static void main(String[] args) {
    //     int i=100,j=1;
    //     while(i-->0)
    //     {
    //         System.out.println(j);
    //         j++;
    //     }
    // }


    /* package codechef; // don't place package name! */
    // }
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class practice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long a=sc.nextLong();
		    int x=0;
		    while(a%2==0){
	        a/=2;
	        x++;
	    }
	    if(x%2==0)
	    System.out.println("1");
	    else
	    System.out.println("0");
		}
	}
}

