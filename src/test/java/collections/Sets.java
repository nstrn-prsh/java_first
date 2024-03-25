package collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Sets {
    @Test
    void should_make_a_set() {
        Set<String> str = new HashSet<>();
        str.add("cat");
        str.add("cat");
        str.add("cat");
        str.add("dog");
        Set<String> expectedStr = new HashSet<>();
        expectedStr.add("cat");
        expectedStr.add("dog");
        Assertions.assertThat(str).isEqualTo(expectedStr);
    }

    @Test
    void should_sort_data() {
        Set<String> sortedList = new TreeSet<>();
        sortedList.add("dog");
        sortedList.add("rabbit");
        sortedList.add("cat");
        Set<String> expectedSortList = new LinkedHashSet<>();
        expectedSortList.add("cat");
        expectedSortList.add("dog");
        expectedSortList.add("rabbit");
        Assertions.assertThat(sortedList).isEqualTo(expectedSortList);
    }
}
