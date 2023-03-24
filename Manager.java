package Fibonacci;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Manager {
    private static final String FILENAME_EVEN = "NumerosPares.txt";
    private static final String FILENAME_ODD = "NumerosImpares.txt";
    
    public void execute() {
        List<Integer> fibonacciNumbers = Fibonacci.generateFibonacciSequence(1000000);
        
        List<Integer> evenNumbers = Splitter.getEvenNumbers(fibonacciNumbers);
        List<Integer> oddNumbers = Splitter.getOddNumbers(fibonacciNumbers);
        
        saveToFile(FILENAME_EVEN, evenNumbers);
        saveToFile(FILENAME_ODD, oddNumbers);
    }
    
    private void saveToFile(String filename, List<Integer> numbers) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int number : numbers) {
                writer.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
