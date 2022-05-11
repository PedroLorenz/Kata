import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzzBazz {
    @ParameterizedTest
    @CsvSource(value = {
    "1", "2", "4", "8", "11", "13", "16", "17", "19"})
    public void quantEntradaNoMultipleDe3Ni5Ni7(int input) {
        String expected = Integer.toString(input);
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }

    @ParameterizedTest
    @CsvSource(value = { "3", "6", "9", "12"})
    public void quantEntradaMultipleDe3(int input) {
        String expected = "Fizz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
    @ParameterizedTest
    @CsvSource(value = { "5", "10", "20", "25"})
    public void quantEntradaMultipleDe5(int input) {
        String expected = "Buzz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
    @ParameterizedTest
    @CsvSource(value = { "7", "14", "28", "49"})
    public void quantEntradaMultipleDe7(int input) {
        String expected = "Bazz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
    @ParameterizedTest
    @CsvSource(value = { "15", "30", "45", "60"})
    public void quantEntradaMultipleDe3y5(int input) {
        String expected = "FizzBuzz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
    @ParameterizedTest
    @CsvSource(value = { "21", "42", "63", "84"})
    public void quantEntradaMultipleDe3y7(int input) {
        String expected = "FizzBazz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
    @ParameterizedTest
    @CsvSource(value = { "35", "70", "140", "175"})
    public void quantEntradaMultipleDe5y7no3(int input) {
        String expected = "BuzzBazz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }

    @ParameterizedTest
    @CsvSource(value = { "105", "210", "420", "630"})
    public void quantEntradaMultipleDe5y7y3(int input) {
        String expected = "FizzBuzzBazz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }

    
}