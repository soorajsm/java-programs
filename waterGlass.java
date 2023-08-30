import java.util.Scanner;

public class waterGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int bound=n;
            int i=1;
            while(n>0)
            {
              
                if(m+n>bound)
                    n=bound;
                else
                n=n+m;
                  n=n-i;
                i++;

            }
                    System.out.println(i);

        }
    }
}
