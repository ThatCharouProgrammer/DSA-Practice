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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        float countPositive = 0;
        float countNegative = 0;
        float countZero = 0;
        int denominator = arr.size();

        for (int i = 0; i < denominator; i++){
            if (arr.get(i) < 0) {
                countNegative++;
            }
            else if (arr.get(i) > 0) {
                countPositive++;
            }
            else{
                countZero++;
            }
        }


        System.out.format("%.6f\n" ,countPositive/denominator);
        System.out.format("%.6f\n" ,countNegative/denominator);
        System.out.format("%.6f\n" ,countZero/denominator);

    }
}

public class Q1_PlusMinus {
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
