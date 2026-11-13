
public class StatFinal {
    static {
        int a =10;
        final double PI;
                PI = 3.14;
//         void HelloStatic(){
//            System.out.println("Hello World");
//        }
    }


    public static void main(String[] args){

        Pros p = new Pros();
        p.name = "test";
        p.age = 20;

//        p.college = "Test";
        Pros.college = "Class Defined";
        System.out.println("the object data is : " + p.name + " " + p.age  + " " + p.college);
        Pros q = new Pros();
        q.name = "test q";
        q.age = 10;
        q.college = "Test Q";
        System.out.println("the object data is : " + q.name + " " + q.age  + " " + q.college);


    }

    static void printHello(final String name){
//          name = "fgf";
    }


}


 class Pros{
    String name;
    int age;
    static String college;
}