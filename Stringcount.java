import java.util.Arrays;

import java.util.Scanner;

public class Stringcount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,count=0;
        String a[]=new String[n];
        String str[]=new String[n];
        while(i<n)
        {
            a[i]=sc.next();
        }
        int loc=sc.nextInt();
        Arrays.sort(a);
        for(int j=0;j<n;j++)
        {
            if(a[j]!=a[j+1])
            {
                str[count++]=a[j];
            }
        }
        System.out.println(str[loc]);
    }
    
}
 
