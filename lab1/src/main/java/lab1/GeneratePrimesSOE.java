package lab1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class Generates prime numbers up to a user specified maximum.
 * the algorithm used is the Sieve of Eratosthenes.
 * <p>
 * Eratosthenes of Cyrene, b. c. 276 BC, Cyrene, Libya --
 * d. c. 194, Alexandria. The first man to calculate the circumference
 * of the Earth. Also known for working on calendars with leap
 * years and ran the library at Alexandria.
 * <p>
 * The algorithm is quite simple. Given an array of integers starting
 * at 2. Cross out all multiples of 2. Find the next uncrossed
 * integer, and cross out all of its multiples. Repeat until
 * you have passed the square root of the maximum value.
 *
 * @author Peter Unger
 * @version 1.0
 */
public class GeneratePrimesSOE {

    public static List<Integer> generatePrimes(int maxValue) {
        boolean primes[] = new boolean[maxValue + 1];
        Arrays.fill(primes, true);

        for (int currentPrime = 2; (currentPrime * currentPrime) <= maxValue; currentPrime++) {
            if (primes[currentPrime]) {
                for (int i = currentPrime * 2; i <= maxValue; i += currentPrime) {
                    primes[i] = false;
                }
            }
        }

        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= maxValue; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

}
