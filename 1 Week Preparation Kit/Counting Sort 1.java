import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Given a list of integers, count and return the number of times each value appears as an array of integers.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    
    int [] frequencyArray = new int[100]; //100 because it's the default in the question
    Arrays.fill(frequencyArray, 0); //make all 100 elements the value of 0
    
    
    //ex: int[4] (instead of 100), [3, 2, 2, 1]
    for (Integer a: arr){
        //please note: this only works if all element values are < array length
        frequencyArray[a]++; //[0,1,2,1]
    }
    
    //convert array to ArrayList
    List<Integer> results = new ArrayList<Integer>();
    
    for (int i=0; i<100; i++) {
        results.add(frequencyArray[i]);
    }
    
    return results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
