import java.util.Scanner;

class Trial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            String name=in.nextLine();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            float avg=(float)(a+b+c+d)/4;
            System.out.println(avg);


        }

    }
}
