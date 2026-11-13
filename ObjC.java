import javax.print.attribute.standard.JobKOctets;
import java.util.Objects;

public class ObjC  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Stud stud = new Stud("Test", 21);
        Stud stud1 = new Stud("Test 1" , 21);
//        try {

             Stud stud2 = (Stud) stud.clone();
//            }
//        catch (CloneNotSupportedException ex) {
//            System.out.println("This is throwing clone not supported exception");
//            }
//        Integer in = 8;
//        System.out.println(stud.equals(in));
        System.out.println(stud.hashCode());
        System.out.println(stud2.hashCode());
//          System.out.println(stud.getClass().getName());
//          System.out.println(stud instanceof Studs);
//        System.out.println(stud.toString());
    }
}

class Studs {
}


class Stud extends Studs implements Cloneable{
    String name;
    int    age;

    Stud(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "The name is : " + name + " and the age is : " + age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if( obj.getClass() != this.getClass() ) return false;
        Stud stud = (Stud) obj;
        return ( this.name == stud.name && this.age == stud.age);
    }

    @Override
    public int hashCode(){
        int res = 33 * name.hashCode();
        res += 37 * age;
        return res;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
}

}


