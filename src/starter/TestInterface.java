package starter;

import java.util.List;

public interface TestInterface {

    void makeCall();

    void makeAnotherCall();

    static void StatMeth() {
        System.out.println("This is static method");
    }

    default void defaultCall(List<Poly> poly) {
        System.out.println("This is the default system method for interfaces");
    }
}
