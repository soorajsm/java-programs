import java.util.Scanner;

public class btod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        String b="";
        int count=0;
        while(n>0)
        {
           b=Integer.toString(rem=n%2)+b;
           n/=2;
        }
       System.out.println("the binery number is "+b);
    }
}