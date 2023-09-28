import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class marksCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int unique=0;
        for(int i=1;i<=n;i++)
        {
            if(i!=a[i])
            {
                unique=a[i];
                break;
            }
        }
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]==a[i-1])
            {
                unique+=1;
                a[i]=unique;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
