import java.util.Scanner;

public class addMonths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        if(m>12)
        {
            int res=m/12;
            y+=res;
        }
        else if(m==12)
            y+=1;
        System.out.println(y);
    }
}
