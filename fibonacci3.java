import java.util.Scanner;

public class fibonacci3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int sum=0;
        int i=0,j=3;

        while(j<n)
        {
            sum=0;
            while(i<j)
            {
                sum+=a[i];
                i++;
            }
            a[j]=sum;
            j+=1;
            i=j-3;
        }
       System.out.println(a[n-1]);
        
    }
    
}
