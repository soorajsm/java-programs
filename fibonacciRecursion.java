import java.util.Scanner;

public class fibonacciRecursion {
    static int a=0,b=1,c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }

    public static void fib(int n)
    {
        if(n>1)
        {
            c=a+b;
            a=b;
            b=c;
            fib(n-1);
        }
        else
        System.out.print(a+" ");
    }
}
