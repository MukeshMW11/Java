
public class Hello {
    public static void main(String[] args) {
        AI ai = new AI(10);
    }
}

class Human {
    private String name;
    private static int age = 10;

    public Human() {
        System.out.println("Inside  the human constructor ");
    }

    public Human(int n) {
        System.out.println("Inside the parameterized constructor ");
    }

}

class AI extends Human {
    public AI() {
        System.out.println("Inside the AI constructor ");
    }

    public AI(int n) {
        this();
        System.out.println("Inside the parameterized constructor of AI ");
    }
}