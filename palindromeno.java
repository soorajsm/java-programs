import java.util.Scanner;

public class palindromeno {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oriN=n;
        int rev=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);
        if(oriN==rev)
        System.out.println("palindrome");
        else
        System.out.println("Not a palindrome");
     
     }
}
