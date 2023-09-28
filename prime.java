import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        for(int j=0;j<5;j++)
        {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int number=sc.nextInt();

        if(number<=1)
            System.out.println(false);
        else
        {
            for(int i=2;i<number;i++)
            {
            if(number%i==0)
                 count++;
            }
            if(count>0)
                System.out.println(false);
            else
            System.out.println(true);
            }
        }
    }
}
