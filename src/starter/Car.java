package starter;

class Car {

    private String name;
    protected int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    void drive() {
        System.out.println(name + " is driving at " + speed + " km/h");
    }

    void setName(String name) {
        this.name = name;
    }
};

class BMW extends Car {

    public BMW() {
        super(200);

    }

    void drive() {
        System.out.println("BMW is driving at " + speed + " km/h");
    }
}