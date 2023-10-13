public class paliTwopointers {
    public static void main(String[] args) {
        String s="maiyiam";
        int i=0;
        int j=s.length()-1;
        boolean ispali=true;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                ispali=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ispali);
    }
}
