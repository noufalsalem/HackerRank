import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        
        if (n%2 == 0) { //if n is even
            if (n >= 2 && n <= 5) { //nested if for if n is even -- if even n is in the INCLUSIVE range of 2 - 5
                System.out.println("Not Weird");
            } else if (n >= 6 && n <=20) { //if even n is in the inclusive range of 6 and 20
                System.out.println("Weird");
            } else { // if n is greater than 20
                System.out.println("Not Weird");
            }
        } else { // if n is odd
            System.out.println("Weird");
        }
    }
}
