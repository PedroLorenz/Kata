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
    public void quantEntradaMultipleDe37(int input) {
        String expected = "Fizz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
    @ParameterizedTest
    @CsvSource(value = { "5", "10", "20", "25"})
    public void quantEntradaMultipleDe37(int input) {
        String expected = "Fizz";
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
}