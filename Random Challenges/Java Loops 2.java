import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int query =scanner.nextInt(); //3
        for(int i=0; i<query; i++){
        
            int a = scanner.nextInt(); //1
            int b = scanner.nextInt(); //2
            int n = scanner.nextInt(); //3      
            int sum = a; //1 
            
            for (int j = 0; j<n; j++) { // j < 3          
                int nextEl = (int)Math.pow(2, j)*b; // nextEl = (2^j) x b = 2 x 2
                sum = sum + nextEl; // 1 + 4
                System.out.printf("%s ",sum); //5                            
            }
            if (i < query-1) { 
                System.out.print("\n");
            }
            
        }
        scanner.close();       

    }
}
