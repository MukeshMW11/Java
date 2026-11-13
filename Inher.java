import java.util.Vector;

public class Inher {

    public static void main(String[] args){
//        Cart cart = new Cart();
//        cart.print();
//        cart.calculate();
//    cart.print();
//        System.out.println(cart.a);
//        System.out.println(cart.b);




    }

}


interface  driveable {
//    int a;
//    int b;

     void print();

//    void calculate(){
//        System.out.println("This is calculate of abstract class VehicleAbs");
//    }
}



abstract class VehicleAbs {
    int a;
    int b;

   abstract void print();

   void calculate(){
       System.out.println("This is calculate of abstract class VehicleAbs");
   }
}


class Vehicle implements  driveable {
    int a = 123;
    int b = 456;


    Vehicle(){
        System.out.println("This is  a vehicle default constructor");
    }

    Vehicle(int a , int b ){
        this.a = a;
        this.b  =b ;

        System.out.println("This is the parameterized constructor of Vehicle");

}

    @Override
   public void print() {

    }
//
//    void print(){
//        System.out.println("Hello this is Class A");
//
//    }
}


class Cart extends Vehicle {
        int a =1;
        int b= 2;


        Cart(){
            super();
            System.out.println("This is the default constructor");
        }


    public void print(){

        super.print();

        System.out.println(a + b);
        System.out.println(super.a + super.b);
    }


    void calculate(){
        System.out.println("Hello this is Class A calculate");

    }



}
