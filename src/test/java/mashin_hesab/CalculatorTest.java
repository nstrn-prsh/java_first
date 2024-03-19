package mashin_hesab;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void addNumbers() {
//        given
        int numb_1 = 5;
        int numb_2= 7;
//        when
        int result = getResult(numb_1, numb_2);
//        then
        assertEquals(12, result);
    }

    @Test
    void multipleNumbers() {
        //        given
        int numb_1 = 5;
        int numb_2= 3;
//        when
        int result = getMultipleResult(numb_1, numb_2);
//        then
        assertEquals(15, result);
    }

    private int getMultipleResult(int numb_1, int numb_2) {
        return numb_1 * numb_2;
    }

    private static int getResult(int numb_1, int numb_2) {
        int result = numb_1 + numb_2;
        return result;
    }
}
