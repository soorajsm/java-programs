import java.util.*;
import java.lang.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
                stack.push(7);
                        stack.push(5);
        stack.push(9);
        stack.push(5);
        stack.push(4);
        stack.push(6);

        System.out.println(stack.toString());

        // while(!stack.isEmpty())
        // {
        //     System.out.print(stack.pop()+" ");
        // }

        Collections.min(stack);
        System.out.println(stack);

    }
}
