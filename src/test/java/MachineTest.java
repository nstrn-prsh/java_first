import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.*;

import machine.MyMachine;
import org.junit.jupiter.api.Test;

public class MachineTest {

    @Test
    void test_kardane_method_ha_va_constructor_ha(){
//        given
        MyMachine benz = new MyMachine("benz");
//        when
        boolean ayaHarekatMikonad = benz.aya_machine_harekat_mikonad();
//        then
        assertFalse(ayaHarekatMikonad);

//        constructors
        MyMachine firstConstructor = new MyMachine();
        out.println("aya machine rooshan ast? " + firstConstructor.machine_roshan_ast );
        firstConstructor.aya_machine_harekat_mikonad();

        MyMachine secondConstructor = new MyMachine("bmw");
        secondConstructor.roshan_kardane_machine();
        secondConstructor.aya_machine_harekat_mikonad();
        secondConstructor.baz_kardane_dar();
        secondConstructor.aya_machine_harekat_mikonad();
    }
}
