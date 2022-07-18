import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner (System.in);
        
        // input format should be int -> double -> string,
        // while output should be opposite order; string -> double -> int
      
        int i = input.nextInt();
        double d = input.nextDouble();
        input.nextLine(); // skip remainder of double line. Do this when wanting to use string input immediately after an nextInt or nextDouble
        String s = input.nextLine();
        
        input.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
