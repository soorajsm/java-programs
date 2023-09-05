

import java.util.Scanner;

public class BitCount
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            String num=Integer.toBinaryString(i);
            for(int j=0;j<num.length();j++)
            {
                char ch=num.charAt(j);      //this program can be also done by using Integer.bitCount() function
                                           // ex : Integer.bitCount(4) will be equal to 1
               if(ch=='1')
               {
                count++;
               }
            }
        }
        System.out.println(count);
    }
}

/*

***question***

 * Let input N = 5

then we have to count total set bits in digit 1 to 5

for (1) => (0001), set bits = 1     
for (2) => (0010), set bits = 1
for (3) => (0011), set bits = 2
for (4) => (0100), set bits = 1
for (5) => (0101), set bits = 2
Total set bits = 7

Therefore, for N = 5, result is 7
 * 
 */
