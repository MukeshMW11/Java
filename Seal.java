sealed class A extends Thread permits B, C {

}

final class B extends A {

}

non-sealed class C extends A {

}

class D extends C {

}

public class Seal {
    public static void main(String[] args) {

        System.out.println("test");
    }
}
