public class ImmutableClassEx {
    public static void main(String[] args){

        College college = new College("TEST" , "TEST");

        Halos halos = new Halos(10 , "HELLO" , college);

        halos.getCollege().name = "dsada";

        System.out.println(halos.getCollege().name);

    }
}


class College {
     String name;
     String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}


final class Halos {
    final int age;
    final String response;
    final College college;

    Halos(int age, String response, College college){
        this.age = age;
        this.response = response;
        this.college = new College("REST","REST");
    }

    final void print(){
        System.out.println("Hello World");
    }

    final int getAge(){
        return  age;

    }
    final  String getResponse(){
        return response;
    }

    final College getCollege(){
        return new College("GETS", "GETS");
    }
}



//class HalosExtend extends Halos{
//}

