import java.util.Arrays;
import java.util.Scanner;

public class freqDome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            int len=str.length();
            if(len%2==0) 
            {
                String firsth=str.substring(0, len/2);
                 String sech=str.substring(len/2, len);
                char fha[]=firsth.toCharArray();
                char sha[]=sech.toCharArray();
                Arrays.sort(fha);
                Arrays.sort(sha);
                if(Arrays.equals(fha,sha))
                    System.out.println("Yes");
                else
                    System.out.println("No");
                
            }
            else 
            {
                String firsth=str.substring(0, len/2);
                 String sech=str.substring(len/2+1, len);
                char fha[]=firsth.toCharArray();
                char sha[]=sech.toCharArray();
                Arrays.sort(fha);
                Arrays.sort(sha);
                if(Arrays.equals(fha,sha))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
