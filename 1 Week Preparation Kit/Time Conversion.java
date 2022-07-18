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
     * The function is expected to return a STRING in 24-hour format
     * The function accepts STRING s as parameter in 12-hour format.
     */

    public static String timeConversion(String s) {
        
        DateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa"); //input format as 12 hour format
        DateFormat outFormat = new SimpleDateFormat("HH:mm:ss"); //output format as 24hr format
        
        Date date = null;
        try {
            date = inFormat.parse(s); //parse the input from string to Date datatype & assign to "date"
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        String myString = ""; 
        
        if (date != null) {
            myString = outFormat.format(date);
        } 
        
        return myString;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
