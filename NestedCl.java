public class NestedCl {
    public static void main(){
//        Banking banking = new Banking();
//        Banking.InterestCalculation interestCalculation = new Banking.InterestCalculation(10 , banking);
//        System.out.println("The principal amount after interest is: " + interestCalculation.calculateInterest(100));

//            Outer outer = new Outer();
//            Outer.Inner inner= outer.new Inner();
//            Outer.Inner inner = new Outer().new Inner();
//            inner.print();
//            Al al = new Al();
//            al.print();

        Anon anon = new Anon(){


            @Override
            void print(){
                calculate();
                System.out.println("This is anonymous class");
            }

            void calculate(){
                System.out.println("This is anonymous calculate class");
}
        };

        anon.print();

    }
}



class Anon{

    void print(){
        System.out.println("This is an defined class");
    }

}



//class Al{
//
//    void print(){
//        class Bl{
//            void show(){
//                System.out.println("This is Bl class show");
//            }
//        }
//
//        Bl bl = new Bl();
//        bl.show();
//
//    }
//
//}


//class Outer {
//    int a = 20;
//    class Inner{
//        int a = 10;
//        void print(){
//            System.out.println("This is inner class print method");
//            System.out.println(Outer.this.a);
//
//        }
//
//        static void calculate(){
//            System.out.println("This is calculate in inner class");
//        }
//
//    }
//}



//class Banking{
//    double dividendsAmount;
//    int dividendsRate;
//
//
//    static class InterestCalculation{
//        int rate;
//        Banking banking;
//
//        InterestCalculation(int rate, Banking banking){
//            this.rate = rate;
//            this.banking = banking;
//        }
//
//        double calculateInterest(double principal){
//            return (principal * rate + banking.dividendsAmount * banking.dividendsRate)/100;
//        }
//
//    }
//
//}