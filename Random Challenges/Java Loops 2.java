import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();            
            int sum = a;
            for (int j = 0; j<n; j++) {                
                int nextEle = (int)Math.pow(2, j)*b;
                sum = sum + nextEle;
                System.out.printf("%s ",sum);                                
            }
            if (i < t-1) {
                System.out.print("\n");
            }
            
        }
        scanner.close();       

    }
}
