import java.util.Scanner;

public class doors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int flag=0;
        while(t-->0)
        {
            String str=sc.next();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(Character.isLowerCase(ch) &&str.indexOf(Character.toUpperCase(ch))>str.indexOf(ch))
                {
                    flag=1;
                }
                else{
                    flag=0;
            
                }
            }
            if(flag==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
