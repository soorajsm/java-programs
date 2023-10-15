public class reversestr
{
    public static void main(String[] args) {
        
        String name="soorajsm";
        String rev="";
        for(int i=0;i<name.length();i++)
        {
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);
        

    }
}