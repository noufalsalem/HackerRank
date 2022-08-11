import java.io.*;
import java.util.*;

public class Solution {
    
//Given a string, s, and an integer, k, complete the function so that /it finds the *lexicographically* smallest and largest substrings of length.

/////////////////////////////////////////////////////////////////////
///////// CHECK END OF PAGE FOR ALTERNATIVE METHOD /////////////////
////////////////////////////////////////////////////////////////////
  
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        int k = scan.nextInt();
        
        scan.close();

        String temp = s.substring(0, k); //first 0-k letters, temp string to compare to
        String smallest = temp; //temporarily assigned
        String largest = temp; //temporarily assigned
        
//for loop: start at 1 as temp already starts at 0. 
//for loop: condition <= s.length()-k as to not get out of bounds exception. i.e: if s = helloHi && k = 3, index 6 would result in out of bounds as there is no 7, 8
        
        for (int i = 1; i <= s.length()-k; i++)
        {
            temp = s.substring(i, i+k); 
            
            if (temp.compareTo(smallest) < 0) 
            {
                smallest = temp;
            }
            
            if (temp.compareTo(largest) > 0)
            {
                largest = temp; 
            }
        }
        
        System.out.println(smallest + "\n" + largest);
    
    }
}

//alternatively, put everything after the scanner closes into a separate method (getSmallestAndLargest) instead of the main method as follows: 

/** 

public static String getSmallestAndLargest(String s, int k) {
    String temp = s.substring(0, k);
    
    String smallest = temp; 
    String largest = temp; 
        
        for (int i = 1; i <= s.length()-k; i++)
        {
            temp = s.substring(i, i+k); 
            
            if (temp.compareTo(smallest) < 0) 
            {
                smallest = temp;
            }
            
            if (temp.compareTo(largest) > 0)
            {
                largest = temp; 
            }
        }
        
        return smallest + "\n" + largest;
}


THEN call the method in the main body like: 
getSmallestAndLargest(s, k);
*/
