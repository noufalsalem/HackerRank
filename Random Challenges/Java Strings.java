import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        
        String A = scan.nextLine();
        String B = scan.nextLine();
        
        scan.close();
        
        System.out.println(A.length() + B.length());
        
        
        //is A lexicographically greater than B
        System.out.println(A.compareTo(B) > 0? "Yes":"No"); 
        
        //Capitalize first letter of A and B 
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1)); 
        
    }
}
