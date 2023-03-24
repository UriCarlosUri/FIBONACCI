package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> generateFibonacciSequence(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        
        int a = 0, b = 1, c = 0;
        
        while (c <= limit) {
            fibonacciNumbers.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        
        return fibonacciNumbers;
    }
}
