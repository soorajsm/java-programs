
import java.util.Scanner;

public class RichestCust {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int a[][]={{7,1,3},{2,8,7},{1,9,5}};
        
     //traversing the 2D array using for-each loop
     int maxAmount=0;
        for(int cust[]:a)   // for each loop to access 2D array
        {
            int personWealth=0;
            for(int amount:cust)    // for each loop to access 2D array
            {
                personWealth+=amount;
            }
            maxAmount=Math.max(maxAmount,personWealth);
        }
        System.out.println(maxAmount);
    }
}
