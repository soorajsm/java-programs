import java.util.Arrays;

public class ACV_primeconstr {
    public static void main(String[] args) {
        int a[]={3,4,5,2};
        Arrays.sort(a);
        int small=a[0];
        int value=small+findlcm(a);
        if(isprime(value))
            System.out.println(value);
        else
            System.out.println("None");
    }
    public static boolean isprime(int n)
    {
        int i=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                break;
        }
        if(i==n)
            return true;
        else 
            return false;
    }
    public static int findlcm(int a[])
    {
        int j=0;
        int la=a[a.length-1];
        for(int i=la;;i+=la)
        {
            for(j=1;j<a.length-1;j++)
            {
                if(i%a[j]!=0)
                    break;
            }
            if(j==a.length-1)
                return i;

        }
    }
}
