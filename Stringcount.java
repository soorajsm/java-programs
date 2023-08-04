
import java.util.Arrays;
import java.util.Scanner;
public class Stringcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean repeated=false;
        int count=0;
        String a[]=new String[n];
        String str[]=new String[n];
        for( int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }

        int loc=sc.nextInt();
        for( int i=0;i<n;i++)
        {
            repeated=false;
           for(int j=0;j<n;j++)
           {
                if(i!=j && a[i].equals(a[j]))
                {
                    repeated=true;
                    break;
                }
           }
           if(repeated==false)
           str[count++]=a[i];
        }
        System.out.println(str[loc-1]);
    }
}
 
