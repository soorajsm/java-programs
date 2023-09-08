
import java.util.Scanner;
class Happy
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String s = read.next();
    		int max = 0;
    		int flag = 0;
    		// Update your code below this line to solve the problem
    		for(int z=0;z<s.length();z++)
    		{
    		    Character k=s.charAt(z);
    		    if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
    		    {
    		         flag++;
    		         if(flag>max)
                        max=flag;
    		    }
    		    else
    		        flag=0;
    		       
    		  
    		}
            if(max>2)
                System.out.println("Happy");
            else
    		 System.out.println("Sad");
		}
	}
}

// Chef has a string 
// �
// S with him consisting of only lowercase alphabets.
// Chef is happy if the string contains a contiguous substring of length strictly greater than 
// 2
// 2 in which all its characters are vowels.
// Determine whether Chef is happy or not.



// Input

// 4
// aeiou
// abxy
// aebcdefghij
// abcdeeafg

// Output

// Happy
// Sad
// Sad
// Happy