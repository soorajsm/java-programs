import java.util.ArrayList;

public class totalwork
{
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        int sum=3;
        int j=0;
        for(int i=3;i<n;i++)
        {
            sum=sum+list.get(i-1)-j;
            sum=sum%1000000007;
            list.add(sum);
            j=list.get(i-3);
        }
        System.out.println(list.get(n-1));
    }
}