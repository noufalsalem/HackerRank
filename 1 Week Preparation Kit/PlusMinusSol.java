import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double pos = 0, neg = 0, zer = 0;
    int listSize = arr.size();
    
    for (int i = 0; i < listSize; i++) {
        if (arr.get(i) > 0) {
            pos++;
        } else if (arr.get(i) < 0) {
            neg++;
        } else {
            zer++;
        }
    }

    pos/= listSize;
    neg/= listSize;
    zer/= listSize;
    System.out.println(pos);
    System.out.println(neg);
    System.out.println(zer);
    
    }

}

public class PlusMinusSol {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
