import java.util.Scanner;

public class perfectsqr {
public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<n;i++)
    {
        if(i*i<=n)
        count++;
    }
    System.out.println(count);
}    
}
