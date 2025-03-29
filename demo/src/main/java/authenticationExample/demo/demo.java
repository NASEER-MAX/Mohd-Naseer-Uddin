package authenticationExample.demo;

import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo {

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .allMatch(n -> num % n != 0);
    }


    public void demo1(){
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

    // Example 1: Filter numbers greater than 50 and print
        numbers.stream()
                .filter(n -> n > 50)
            .forEach(System.out::println);

    // Example 2: Convert each number to its square and collect to a list
    List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

    // Example 3: Find the sum of all numbers using reduce
    int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

    // Example 4: Find the maximum number
    int maxNumber = numbers.stream()
            .max(Integer::compare)
            .orElse(-1);
        System.out.println("Max: " + maxNumber);

    // Example 5: Count numbers greater than 50
    long count = numbers.stream()
            .filter(n -> n > 50)
            .count();
        System.out.println("Count of numbers > 50: " + count);
}
public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(10, 15, 7, 3, 19, 20, 23, 30, 37, 41, 50);

//    System.out.println(numbers.stream().map(n));

    // Filtering prime numbers using Streams
    List<Integer> primeNumbers = numbers.stream()
            .filter(demo::isPrime)
            .collect(Collectors.toList());

    // Printing the prime numbers
    System.out.println("Prime Numbers: " + primeNumbers);

}
}
