import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        int mid=(str.length()/2)+1;
        int b_pos=mid-n/2;
        int e_pos=mid+n/2;
        String beg=str.substring(0, b_pos);
        String end=str.substring(e_pos,str.length());
        String mids=str.substring(b_pos, e_pos);
        mids=new StringBuilder(mids).reverse().toString();
        System.out.println(beg+" " +mids+" "+end);
    }
    
}
