import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class sample {

     static char firsta[];
        static char seca[];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String first=sc.next();
        String sec=sc.next();


        int len=Math.max(first.length(),sec.length());
         firsta=new char[len];
         seca=new char[len];

        firsta=first.toCharArray();
        seca=sec.toCharArray();

        int len2=first.length()+sec.length();
        char fa[]=new char[len2];
        for(int i=0;i<len;i++)
        {
            if(i<firsta.length && i<seca.length)
            {
                if(firsta[i]<seca[i])
                {
                fa[i]=firsta[i];
                fa[len2-1-i]=seca[i];
                }
                else
                {
                 fa[len2-1-i]=firsta[i];
                fa[i]=seca[i];
                }
            }

            else if(i>=firsta.length)
            {
                for(int j=i;j<seca.length;j++)
                {
                    fa[i]=seca[j];
                    i++;
                }     
            }
            else if(i>=seca.length)
            {
                for(int j=i;j<firsta.length;j++)
                {
                    fa[i]=firsta[j];
                    i++;
                }         
            }
        }

        String last=String.valueOf(fa);
        System.out.println(last);
        
    }
}
