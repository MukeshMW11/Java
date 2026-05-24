package starter;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(100);
        car1.setName("Toyota");
        car1.drive();
        PolyLoader();
        PolyOverriding();
        TestIntface t1 = new TestIntface();
        t1.makeCall();

    };

    public static void PolyLoader() {
        Poly pol = new Poly();
        pol.add(1, 2);
        pol.add('a', 'b');
    }

    public static void PolyOverriding() {
        Parent p = new Child();
        p.hello();
    }

}
