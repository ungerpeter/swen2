package lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class GeneratePrimesSOETest {

    @Test
    void negativeNumberHandling() {
        int[] generatedPrimes = GeneratePrimes.generatePrimes(-5);
        int[] shouldBe = new int[]{};
        assertTrue(Arrays.equals(generatedPrimes, shouldBe));
    }

    @Test
    void numberSmallerSmallestPrime() {
        int[] generatedPrimes = GeneratePrimes.generatePrimes(1);
        int[] shouldBe = new int[]{};
        assertTrue(Arrays.equals(generatedPrimes, shouldBe));
    }

    @Test
    void findSmallestPrimeNumber() {
        int[] generatedPrimes = GeneratePrimes.generatePrimes(2);
        int[] shouldBe = new int[]{ 2 };
        assertTrue(Arrays.equals(generatedPrimes, shouldBe));
    }

    @Test
    void findPrimesUpToFiveteen() {
        int[] generatedPrimes = GeneratePrimes.generatePrimes(15);
        int[] shouldBe = new int[]{ 2, 3, 5, 7, 11, 13, };
        assertTrue(Arrays.equals(generatedPrimes, shouldBe));
    }

}
