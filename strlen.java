

public class strlen {
    public static void main(String[] args) {
        String str="soorajsm";
        str=str+"\0";
        int c=0;

            while(str.charAt(c)!='\0')
            {
                c++;
            }
            System.out.println(c);
    }
}
