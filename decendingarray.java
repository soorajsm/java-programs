/*Java Program to Sort an Array in Descending Order*/

import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;

public class decendingarray 
{ 
    public static void main(String[] args) 
    { 
        //Collections.reverseOrder do not work for primitive Types 
        //define an array with Integer
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of elements ");
         Integer n=sc.nextInt();
         System.out.println("Enter the array elements ");
         Integer[] arr=new Integer[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
 
        //print original array
        System.out.printf("Original Array: %s", 
                 Arrays.toString(arr)); 
 
        // Sorts the array in descending order 
        Arrays.sort(arr, Collections.reverseOrder()); 
 
        //print sorted array  
        System.out.printf("\n\nSorted Array: %s", 
               Arrays.toString(arr)); 
    } 
}
