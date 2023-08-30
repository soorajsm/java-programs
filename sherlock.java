import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class sherlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       Set <Integer> set = Set.of(1,2,5,10,20,50,100,200,500,2000);
        int shirt[];
        while(t-->0)
        {
            int n=sc.nextInt();
            shirt=new int[n];
            for(int i=0;i<n;i++)
            {
                shirt[i]=sc.nextInt();
            }
            Arrays.sort(shirt);
            for(int j:shirt)
            {
                if(set.contains(j))
                {
                    System.out.println(j);
                }
            }

        }
    }
}
