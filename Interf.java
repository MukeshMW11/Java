public class Interf {
    public static void main(String[] args) {
        TestA a = new TestA();
        a.fun();
//        System.out.println(Total.a);

    }
}

interface AT{
    default void fun(){
        System.out.println("This is fun in AT");
    }
}

class BT{
    public void fun(){
        System.out.println("This is fun in BT");
    }
}


interface Total   {
   public static final int a = 10;



    public  void print();
// Java 8 default methods were introduced
   default void calculate(){
       System.out.println("This is the default method calculate from interface");
   }

// Java 9 now private method was also allowed inside interface
    private  void sign(){
        System.out.println("This is sign method in interface");
   }

}


class TestA extends BT implements AT{

//   public void print(){
//        System.out.println(a);
//    }

//    @Override
//    public void fun(){
//        System.out.println("The fun is overidden in test A");
//    }

}