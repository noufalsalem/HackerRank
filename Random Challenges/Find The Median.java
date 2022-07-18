// Java 8
// get input for array size, get input for array elements, sort array, then pull middle element. 

import java.io.*;
import java.util.*;

public class Solution {
 
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   int [] arr = new int[n];
    
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
  }
    
    Array.sort(arr);
    
    System.out.println(arr[(n/2)]); 
}

