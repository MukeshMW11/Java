
// @Deprecated

import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {

    public void run() {
        System.out.println("Class A");
    }
}

class C implements Cloneable {

}

@FunctionalInterface
interface InnerCont {

    public void run(String s);

}

interface MakerInt {

}

class B extends A {
    @Override
    public void run() {
        System.out.println("Class B");
    }
}

public class Cont {
    public static void main(String[] args) {
        // InnerCont IC = new InnerCont() {
        // public void run() {
        // System.out.println("This is anonomous inner class");
        // }
        // };

        InnerCont IC = (s) -> System.out.println("This is anonomous inner class" + " " + s);

        IC.run("da");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.write(null);
    }
}
