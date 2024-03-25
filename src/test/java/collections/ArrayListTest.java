package collections;
import org.assertj.core.api.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {
    @Test
    void should_return_list() {
        List<String> list = new ArrayList<>();
        assertThat(list).isEmpty();
    }

    @Test
    void array_should_return_list() {
//        given
        int[] arrayNumber  = { 1, 2, 3, 3};
//        when
        Transformer transformer = new Transformer();
        List<Integer> arrayToListNumber = transformer.transform(arrayNumber);
//        add more indexes
        arrayToListNumber.add(4 , 10);
        arrayToListNumber.add(5 , 20);
//        change index values
        arrayToListNumber.add(2 , 22);

//        then
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(3);
        expectedList.add(10);
        expectedList.add(20);
        assertThat(arrayToListNumber).isEqualTo(expectedList);
    }

class Transformer{
        public List<Integer> transform(int[] arrayNumber){
            List<Integer> arrayList = new ArrayList<>();
            for(int number : arrayNumber){
                arrayList.add(number);
            }
            return arrayList;
        }
}

}
