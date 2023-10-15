public class seclarge
{
    public static void main(String[] args) {
        int a[]={5,4,6,7,6,3,6};
        int m1=0,m2=0;
        if(a[0]>a[1])
        {
            m1=a[0];
            m2=a[1];
        }
        else{
            m1=a[1];
            m2=a[2];
        }

        
        for(int i=2;i<a.length;i++)
        {
            if(a[i]>m1)
            {
                m2=m1;
                m1=a[i];
            }
            else if(a[i]>m2)
                m2=a[i];
        }
        System.out.println(m1+"     "+m2);
    }
}