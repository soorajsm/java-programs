import java.util.Arrays;

public class findarraylcm {
    public static void main(String arg[])
    {
        int j=0;
        int a[]={4,5,3,1};
        Arrays.sort(a);
        int la=a[a.length-1];
        for(int i=la;;i+=la)
        {
            for(j=1;j<a.length;j++)
            {
                if(i%a[j]!=0)
                    break;
            }
            if(j==a.length)
            {
                System.out.println(i);
                break;
            }

        }
    }
}
