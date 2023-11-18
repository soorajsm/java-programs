
import java.util.Scanner;

public class ACV_cupsandjugs {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int count=c;
        int carray[]=new int[c];

        for(int i=0;i<c;i++)
            carray[i]=sc.nextInt();
        int index[]=new int[carray[c-1]];
        int jug=sc.nextInt();
        System.out.println("........................................................................................................");
        int j=c-1;


            for(int k=c-1;k>=0;k--)
            {
                if(jug>=carray[k])
                {
                    jug-=carray[k];
                    index[carray[k]-1]+=1;
                }
            }
            
     System.out.println("....................................."+jug);
        while(jug>0)
        {
            for(int k=c-1;k>=0;)
            {
                if(jug>=carray[k])
                {
                    jug-=carray[k];
                    index[carray[k]-1]+=1;
                }
                else
                    k--;
            }
            
        }

     System.out.println("........................................................................................................");
        for(int i=0;i<index.length;i++)
        {
            if(index[i]>0)
                System.out.print(index[i]+" ");
        }
     }
}
