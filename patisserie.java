import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.*;

public class patisserie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            int inc=sc.nextInt();
            int pos=sc.nextInt();
            int sum=0;

            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

 
            Arrays.sort(a, Collections.reverseOrder());
            // int temp=0;
            // for(int j=0;j<n;j++)
            // {
            //     for(int k=j+1;k<n;k++)
            //     {
            //         if(a[j]<a[k])
            //         {
            //             temp=a[j];
            //             a[j]=a[k];
            //             a[k]=temp;
            //         }
            //     }
            // }

            for(int i=pos-1;i<n;i+=inc)
            {
                sum+=a[i];
            }

            System.out.println(sum);
        }
    }
}
