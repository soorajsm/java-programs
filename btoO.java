import java.util.Scanner;

public class btoO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int rem,d=0,base=1;
        while(n>0)
        {
            rem=n%10;
            d+=rem*base;
            base*=2;
            n/=10;
        }
        System.out.println("Decimal no is = "+d);
    }
}
