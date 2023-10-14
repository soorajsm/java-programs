public class Secondlargest {
    public static void main(String[] args) {
        int a[]={12,35,1,10,34,1,3,4,5,23,45,98,23,55};
        int m1=0,m2=0;
        int temp=0;

        if(a[0]>a[1])
        {
        m1=a[0];
        m2=a[1];
        }
        else
        {
        m2=a[0];
        m1=a[1];
        }

        for(int i=2;i<a.length;i++)
        {
            if(a[i]>m1)
            {
                temp=m1;
                m1=a[i];
                m2=temp;
            }

            else if(a[i]>m2)
            {
                m2=a[i];
            }

        }
        System.out.println(m1+"  "+m2);
    }
}
