import java.util.Arrays;
import java.util.Collections;
 
public class Sortstringarray {
    public static void main(String[] args)
    {
        String arr[] = { "practice.geeksforgeeks.org",
                         "www.geeksforgeeks.org",
                         "code.geeksforgeeks.org" };
 
        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println(
                          Arrays.toString(arr));
 
        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
 
        System.out.println(
                          Arrays.toString(arr));
    }
}
    

