import java.util.Arrays;
public class phy_triplet {
    public static void main(String[] args) {
        phy_triplet ob=new phy_triplet();
        int a[]={4,5,1,3,2};
        Arrays.sort(a);
        int l=0;
        int n=a.length-1;
        int h=n-1;
        for(int i=n;i>=2;i--)
        {
            if(ob.sqr(a[l])+ob.sqr(a[h])<ob.sqr(i))
                l++;
            else if(ob.sqr(a[l])+ob.sqr(a[h])>ob.sqr(i))
                h--;
            else if()
        }
    }

    public int sqr(int a)
    {
        return a*a;
    }
}
