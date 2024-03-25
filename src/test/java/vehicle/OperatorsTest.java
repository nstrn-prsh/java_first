package vehicle;

import org.junit.jupiter.api.Test;

import static java.lang.System.*;

public class OperatorsTest {
    @Test
    void Calculation() {
        int firstNumber = 600;
        firstNumber++; //601
        int secondNumber = 12;
        secondNumber += secondNumber;
        out.println(firstNumber + secondNumber);
        out.println(firstNumber - secondNumber);
        out.println(firstNumber / secondNumber);
        out.println(firstNumber * secondNumber);
//        casting:
        out.println((double) firstNumber % (double) secondNumber);
        out.println((double) secondNumber / (double) firstNumber);
//        nokte:
        out.println(firstNumber); //601
        out.println(firstNumber++); //601
        out.println(++firstNumber); // 601+1+1 = 603
    }

    @Test
    void Logic() {
        int x = 2;
        int y = 5;
        int z = 2;
        boolean x1 = x > y;
        boolean x2 = x < y;
        out.println(x1);
        out.println(!x2);
        out.println(x2 && x1);
        out.println(x2 || x1);
        out.println(x == z);
        out.println(x != z);
        out.println(x >= z);
        out.println(x <= z);
    }
}
