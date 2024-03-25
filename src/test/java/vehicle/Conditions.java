package vehicle;

import org.junit.jupiter.api.Test;
import static java.lang.System.*;

public class Conditions {
    @Test
    void If_Else() {
        int myNum = 77;
        boolean shart = myNum % 2 == 0;
        if (shart) {
            result("even");
        } else {
            result("odd");
        }

        myMethod();
    }

    private static void result(String param) {
        out.println(param + " number");
    }

    void myMethod () {
            out.println("hi there.");
        }
}
