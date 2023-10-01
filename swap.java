import java.util.Scanner;

public class swap
{
    public static void main(String[] args) {
        int a=3,b=5;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        a=a^b;
        System.out.println("1 "+a);
        b=a^b;
        System.out.println("2 "+b);
        a=a^b;
        System.out.println("3 "+a);
        System.out.println("a="+a+" b= "+b);
    }
}