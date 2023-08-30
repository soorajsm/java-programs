import java.util.Scanner;

public class revKarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[len];
        int rev[]=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0;
        for(int i=k;i>=0;i--, j++)
        {
            rev[j]=a[i];
        }

        for(int i=k+1;i<len;i++,j++)
        {
            rev[j]=a[i];
        }

        for(int i:rev)
            System.out.print(i+" ");

    }
}
