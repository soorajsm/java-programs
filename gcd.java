public class gcd {
    public static void main(String[] args) {
        int n1=36,n2=60;
        int gcd=0,lcm=0;
        for(int i=1;i<=Math.min(n1,n2);i++)
        {
            if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        for(int i=Math.max(n1,n2);;i++)
        {
            if(i%n1==0 && i%n2==0)
            {
                lcm=i;
                break;
            }
        }

        System.out.println("lcm = "+lcm+"\n"+"Hcf = "+gcd);
    }
}
