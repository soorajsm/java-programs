

import java.util.Scanner;

public class CoronaforComputers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int biteEater=sc.nextInt();

         for(int i=0;i<n;i++)
        {
            String bin=Integer.toBinaryString(a[i]);
            if(bin.length()>biteEater)
            System.out.println(bin.substring(0,bin.length()-biteEater));
            else
            System.out.println("0");
        }

    }
}



