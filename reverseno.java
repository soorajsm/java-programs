import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        int rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
