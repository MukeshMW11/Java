enum Enan {
    Started, Running, Failed, Exit
}

enum Laptop {
    Macbook(2000), Lenovo(2500), Dell(1500), Nitro;

    private int price;

    private Laptop() {
        this.price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("The laptops" + this.name() + " " + this.price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enm {

    public static void main(String[] args) throws Exception {
        Enan en = Enan.Running;
        // Enan[] e = Enan.values();
        // for (int i = 0; i < e.length; i++) {
        // System.out.println(e[i]);
        // }

        // System.out.println(e.getClass().getSuperclass());

        Laptop[] e = Laptop.values();

        // for (Laptop lap : Laptop.values()) {
        // System.out.println(lap);
        // }
    }
}
