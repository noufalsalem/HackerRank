// Java 8
// get input for array size, get input for array elements, sort array, then pull middle element. 
// Array.sort(arr); <-- (in main method) for fastest time complexity. otherwise, use bubbleSort()
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
   scanner.close();
    
   Arrays.sort(arr, 0, n);
   System.out.println(arr[(n/2)]); 
}
}
