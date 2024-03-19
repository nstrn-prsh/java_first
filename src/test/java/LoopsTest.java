import org.junit.jupiter.api.Test;
import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoopsTest {
    @Test
    void ItIsAForLoop() {
        for(int i =0 ; i < 5; i+=2){
            out.println(i + " say hi!");
        }
    }

    @Test
    void Summation() {
//        given
        int num = 5;
//        when
       int finals =  myFact(num);
//         then
        assertEquals(120, finals);
    }

    private static int myFact(int number) {
        int result = 1;
        for (int i = 1 ; i <= number ; i++){
            result *= i ;
        }
        return result;
    }

    @Test
    void WhileLoop() {
        int i=0;
        while (i < 5) {
            out.println("say bye");
            i++;
        }
        do {
            out.println("say nothing");
            i++;
        }while (i < 3);
    }


    @Test
    void sumArrays() {
//        given
        double[] arr = {1,5.2,4,0,-1};
        double[] arr2 = {};
//        when
        double result = switchCase(arr);
        double result2 = arraySummation(arr2);
        out.println(result);
        out.println(result2);
//        then
        assertEquals(9.2 , result);
        assertEquals(0, result2);
    }

    private static double arraySummation(double[] arr) {
        double res = 0;
        if (arr.length == 0){
             res =0;
        }else {
            for (int i = 0; i < arr.length; i++) {
                res += arr[i];
            }
        }
        return res;
    }

    @Test
    double switchCase(double[] arr) {
        double res = 0;
        switch (arr.length){
            case 0 :
                res = 0;
                break;
            case 1 :
                res=  arr[0];
                break;
            case 2:
                break;
            default:
                for (int i = 0; i < arr.length; i++) {
                    res += arr[i];
                }
        }
        return res;
    }
}
