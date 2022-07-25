import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        
        int start= scan.nextInt();
        int end = scan.nextInt();
        
        
        try {
           System.out.println(s.substring(start, end));
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid");
            scan.next();
        }
        
        scan.close();
    }
}
