import org.junit.jupiter.api.Test;
import static java.lang.System.*;

public class ArrayTest {
    @Test
    void FirstArr() {
        String[] langs = {"persian", "english", "french", "german"};
        out.println(langs[0]);
        langs[0] = "dutch";
        out.println(langs[0]);
        out.println("length of array : " + langs.length);
    };
}
