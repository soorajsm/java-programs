import java.util.ArrayList;

public class primeFactor {
    public static void main(String[] args) {
        int n=90,i=2;
        ArrayList<Integer>ar=new ArrayList<>();
        while(n>1)
        {
            if(n%i==0){
                ar.add(i);
                n/=i;
                i=2;
            }
            else
                i++;
        }
        System.out.println(ar);
        
    }
}
