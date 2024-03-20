package machine;
import static java.lang.System.out;

public class MyMachine {
    public boolean dar_baz_ast; // false
    public boolean machine_roshan_ast; // false
    String mark;

    //        constructors
    public MyMachine(){
        out.println("----- yek constructore khali! -----");
    }
    public MyMachine(String mark){
        this.mark = mark;
        out.println("----- model machine " + mark + " ast. -----");
    }

    //        methods
    public void baz_kardane_dar(){
        dar_baz_ast = true;
        out.println("dare machine ro baz kardim!");
    }

    public void roshan_kardane_machine(){
        dar_baz_ast = false;
        machine_roshan_ast= true;
        out.println("machine roshan ast.");
    }

    public boolean aya_machine_harekat_mikonad(){
        if(!dar_baz_ast && machine_roshan_ast){
            out.println("machine harekat mikonad!");
            return true;
        } else {
            out.println("machine park ast!");
            return false;
        }
    }
}
