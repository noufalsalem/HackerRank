    //int q - number of queries.
     
    /* the next q sets of lines are in the following format:
    * the first line of each query contains an int, n.
    
    * each of the next 2n lines contains 2n space-separated integers matrix[i][j] in rowi of the matrix.
    
    *returns int: the maximum sum possible.
    */
    
//MOCK TEST
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        
        
        tests:
        for(int t = 0; t < q; t ++)
        {
            int n = input.nextInt();
            
            //Build the input matrix
            int[][] matrix = new int[2*n][2*n];
            int sum = 0;
            
            for(int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[0].length; j++)
                {
                    matrix[i][j] = input.nextInt();
                }
            }
            
            //Find the 4 swaps for each index in the n*n matrix and add the max
            for(int i = 0; i < n; i++)
            {
              for(int j = 0; j < n; j++)
              {
                  int num1 = matrix[i][(2*n) - j - 1];
                  int num2 = matrix[i][j];
                  int num3 = matrix[(2*n) - i - 1][j];
                  int num4 = matrix[(2*n) - i - 1][(2*n) - j - 1];
                  //System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
                  sum += Math.max(num1, Math.max(num2, Math.max(num3, num4)));
              }
            }
            System.out.println(sum);
        }
    }
}
