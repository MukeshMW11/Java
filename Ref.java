import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class Ref {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Klus", "Sirus", "Groddle", "Krittle");

        List<String> uName = name.stream()
                .map(String::toUpperCase).toList();

        List<Student> st = new ArrayList<>();
        // for (String s : name) {
        // st.add(new Student(s));
        // }

        st = name.stream()
                .map(Student::new).toList();

        System.out.println(st);

    }
}
