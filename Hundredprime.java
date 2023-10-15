public class Hundredprime {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(isprime(i))
                System.out.print(i+"  ");
        }
    }
    static boolean isprime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
