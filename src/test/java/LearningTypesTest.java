import org.junit.jupiter.api.Test;

import static java.lang.System.*;

public class LearningTypesTest {
    @Test
    void PrimitiveTypes() {
//        manfi - mosbat - 0 ta +- 2,000,000,000
        int oddValue = 9;
        out.println(oddValue);
        int negativeNumber = -12;
        out.println(negativeNumber);
//        long
        long too_large_integer = 20000000000L;
        out.println(too_large_integer);
        /*
        * ashari
        * az double bishtar estefade mishe */
        float firstValue = 1.2F;
        out.println(firstValue);
        double secondValue = 1.969696;
        out.println(secondValue);
//        boolean
        boolean trueVal = true;
        boolean falseVal = false;
//        characters and strings
        char character = 'x';
        out.println(character);
        String aStringVal = "Hello World!";
        out.println(aStringVal.toUpperCase());
    }
}
