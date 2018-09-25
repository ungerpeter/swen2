package lab1;

import java.util.stream.IntStream;

/**
 * This class Generates prime numbers up to a user specified maximum.
 *
 * @author Peter Unger
 * @version 1.0
 */
public class GeneratePrimes {

    public static int[] generatePrimes(int maxValue) {
        return IntStream.rangeClosed(2, maxValue)
                .filter(x -> isPrime(x)).toArray();
    }
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> (number % i) == 0);
    }
}
