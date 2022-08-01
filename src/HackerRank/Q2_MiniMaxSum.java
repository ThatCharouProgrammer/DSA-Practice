package HackerRank;

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

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long total = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min){
                min = arr.get(i);
            }
            if (arr.get(i) > max){
                max = arr.get(i);
            }

            total += arr.get(i);
        }

        System.out.println((total - max) + " " + (total - min));

    }

}

public class Q2_MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result2.miniMaxSum(arr);
        bufferedReader.close();
    }
}

// input: 1 3 5 7 9
// output: 16 24
