import org.junit.jupiter.api.Test;
import static java.lang.System.*;

public class CarTest {
    @Test
    void test_kardane_inke_yek_method_va_constructor_chejori_kar_mikone() {
//        new Car();
//        instance aval:
        Car car = new Car(); // output: this is an empty car constructor
        car.car_is_moving(); // output: car is moving method
        out.println("is the door open? " + car.isDoorOpen);
//        instance dovom:
        Car bmw = new Car("BMW");
        bmw.findTheCarName();
    }


    class Car {
        boolean isDoorOpen;
        boolean isTurnedOn;
        String mark;

//        consturctor 1
        Car(){
            out.println("this is an empty car constructor");
        }
//        constructor 2
        Car(String mark){
            this.mark = mark;
            out.println("yek machine " + mark + " sakhtim");
        }

        void findTheCarName(){
            out.println("this is: "+ this.mark);
        }

        void car_is_moving(){
            isDoorOpen = false;
            isTurnedOn = true;
            out.println("car is moving method");
        }

        void car_is_waiting(){
            if(!isTurnedOn && isDoorOpen){
                out.println("car ins not moving!");
            }
            out.println("just to see");
        }
    }
}
