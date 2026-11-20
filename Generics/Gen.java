package Generics;

import org.w3c.dom.ls.LSOutput;

public class Gen {

    public static void main(String[] args) {
//    Object a =  new A(10);
//
//    Object b = new A("STRING");

//    A c = a + 10;
//    String s = (String) b;
//        System.out.println(s);
         B b = new B();

        A<B, Integer> obj = new A<>(b, 10);
        System.out.println(obj);

        A<B, Integer> str = new A<>(b , 10);
//        System.out.println(str.getTest().substring(1,4));
//
//        System.out.println(print("Hello  World",10 ));
//        System.out.println(print(10, true));

    }

//    public static <T, U>  T print(T value, U length ){
//        return value;
//    }

}

interface Swimmable{
    void swim();
}

class B extends Number implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Swimming");
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}


class A<T extends  Number & Swimmable, U extends Number>{
    private T test;
    private U length;

    A(T test, U length){
        this.test = test;
    }

    public T getTest(){
        return  this.test;
    }

    public void setTest(T test){
        this.test = test;
    }


    public U getLength() {
        return length;
    }
    public void setLength(U length){
        this.length = length;
}

}