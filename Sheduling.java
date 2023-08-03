import java.util.Scanner;
public class Sheduling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int day=sc.nextInt();
     
        if(day>n)
            System.out.println("-1");
        else 
        {
            int d=n-(day-1);
             max=0;
             
            for(int i=0;i<d;i++)
            {
                if(a[i]>max)
                max=a[i];
            }

            for(int j=d;j<n;j++)
            {
                max=max+a[j];
            }
             System.out.println(max);
         
        }

    }
}
