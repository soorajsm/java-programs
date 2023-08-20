
// The program is to find the count of exactly two repeated characters from the string using simple array 

public class Repeatedstr {

    public static void main(String[] args) {
        int count=0;
        int asci[]=new int[256];
        String str="aabbccqwertynmnmnm";
        for(char c:str.toCharArray())
        {
            asci[c]+=1;
        }
        for(int i=0;i<256;i++)
        {
            if(asci[i]==2)
                count++;
        }
        System.out.println(count);

    }
}
