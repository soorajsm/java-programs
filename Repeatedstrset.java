
// The program is to find the count of exactly two repeated characters from the string using HashSet in java

import java.util.HashSet;

public class Repeatedstrset {
    public static void main(String[] args) {
        String str="aabbccqwertynmnmnm";
        HashSet<Character> first=new HashSet<>();
        HashSet<Character> sec=new HashSet<>();
        HashSet<Character> thrd=new HashSet<>();
        for(char c:str.toCharArray())
        {
            if(first.contains(c))
            {
                if(sec.contains(c))
                    thrd.add(c);
                else
                    sec.add(c);
            }
            else
            {
                first.add(c);
            }
        }
        sec.removeAll(thrd);
        System.out.println(sec.size());
    }
}
