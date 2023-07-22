import java.util.Scanner;

public class Taxicost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tcost;
        int days[];
        while(n-->0)
        {
            tcost=0;
            int day=sc.nextInt();
            days=new int[day];
            int cost=sc.nextInt();
            for(int i=0;i<day;i++)
            {
                days[i]=sc.nextInt();
            }

            for(int i=0;i<day;i++)
            {
                if(days[i]==1 || days[i-1]==1)
                {
                    tcost=tcost+cost;
                }
            }
            System.out.println(tcost);
        }
    }
    
}
