
// The program is to find the count of exactly two repeated characters from the string using HashMap in java

import java.util.HashMap;

public class RepeatedstrMap {
    public static void main(String[] args) {
        
        int count=0;
        String str="aabbccqwertynmnmnm";
        HashMap<Character,Integer> map=new HashMap<>();

        for(char c : str.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }
        
        for(char c:map.keySet())
        {
            if(map.get(c)==2)
            {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
