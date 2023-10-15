public class StrongNO {
    public static void main(String[] args) {
        int no=40584;
        int ori=no;
        int rem=0,sum=0;
        while(no>0)
        {
            rem=no%10;
            sum+=fact(rem);
            no/=10;
        }
        if(ori==sum)
            System.out.println("Strong number");
        else
            System.out.println("Not a Strong number");

    }
    static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
   
}
