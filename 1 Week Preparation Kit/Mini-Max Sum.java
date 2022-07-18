import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        //miniMinSum (4/5) ; ignore largest #, add the rest
       //miniMaxSum (4/5) ; ignore smallest #, add the rest
       //min, max, totalSum ;; to be determined
       // totalSum - max = minSum, totalSum - min = maxSum
       int min = arr[0];
       int max = arr[0];
       long totalSum = 0; //challenge states output could be greater than 32 bit integer, therefore --> long
       
       for (int n : arr) {
           totalsum += n;
           if (n < min) min = n;
           if (n > max) max = n;
       }
       
       System.out.println((totalSum - max) + " " + (totalSum - min));
       
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
