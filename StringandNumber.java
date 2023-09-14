import java.util.Scanner;

public class StringandNumber {
    public static void main(String[] args) {            // with Integer.parseInt() we can only convert string to int
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String resString="";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            int a=str.charAt(i);
            if(a>65)
            {
                resString=resString+str.charAt(i);
            }
            else
            {
                int NoInint=str.charAt(i)-48; // here we are converting a character value to integer by using its asci value because if we  directly assign character no to int then it stores the numbers ascii value rather than actuall number so here we are subtracting ascii value of zero i.e. 48 from the number.
         
                sum+=NoInint;        // or we can use Integer.parseInt(String.valueOf(ch)); method
            }
               
        }
           System.out.println(resString);
        System.out.println(sum);
     
    }
}
