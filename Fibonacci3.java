import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=1;
        }
        int j=0,boundry=n;
        int sum=0;

        for(int i=n;i<m;i++)
        {
            sum=0;
            while(j<boundry)
            {
                sum+=a[j];
                j++;
            }
            a[i]=sum;
            boundry+=1;
            j=boundry-n;
        }
        System.out.println(Arrays.toString(a));
    }
}
