public class ObjectClass {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.hashCode());
        System.out.println(laptop.toString());

        long one = 10;
        int tow = (int) one;
    }

}

class Laptop {

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}