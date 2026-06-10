interface Egi {
    void code();
}

class Desktop implements Egi {
    public void code() {
        System.out.println("architect, write, compile, test, review, deploy with a bigger screen");

    }
}

class Laptop implements Egi {
    public void code() {
        System.out.println("architect, write, compile, test, review, deploy");
    }
}

class Eng {
    void takeAndCode(Egi lap) {
        System.out.println("Code.......");
    }
}

public class Eg {
    public static void main(String[] args) {
        Egi lap = new Laptop();
        Egi des = new Desktop();
        Eng en = new Eng();
        en.takeAndCode(des);

    }
}
