import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Hashtable;
// import java.util.Iterator;
import java.util.List;
// import java.util.Map;
// import java.util.Set;
// import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student s) {
        return this.age > s.age ? 1 : -1;
    }
}

public class Coll {
    public static void main(String[] args) {
        // List<Integer> arr = new ArrayList<>();
        // List<String> arr = new ArrayList<>();

        // List<Student> arr = new ArrayList<>();

        // arr.add(new Student(35, "Brock Lesnar"));
        // arr.add(new Student(32, "Roman Reigns"));
        // arr.add(new Student(41, "Dean Ambrose"));
        // arr.add(new Student(31, "Seth Rollins"));

        // Set<Integer> arr = new HashSet<>();
        // Collection<Integer> arr = new TreeSet<>();

        // Comparator<Integer> com = (Integer i1, Integer i2) -> i1 % 10 > i2 % 10 ? 1 :
        // -1;
        // Comparator<String> com = (String i1, String i2) -> i1.length() % 10 >
        // i2.length() % 10 ? 1 : -1;

        // Comparator<Student> com = (Student s1, Student s2) -> s1.age > s2.age ? 1 :
        // -1;

        // arr.add(85);
        // arr.add(78);
        // arr.add(54);
        // arr.add(47);
        // arr.add(104);
        // arr.add(101);

        // arr.add("tall");
        // arr.add("calls");
        // arr.add("baller");
        // arr.add("gallt");
        // arr.add("alt");
        // Consumer<Integer> con = n -> System.out.println(n);

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> st = a.stream();
        st.forEach(n -> System.out.println(n));
        System.out.println(st.reduce(0, (c, e) -> c + e));

        // a.forEach(con);

        // Collections.sort(arr);
        // Collections.sort(arr, com);
        // // System.out.println(arr.get(2));
        // for (Student s : arr)
        // System.out.println(s);

        // Iterator<Integer> ar = arr.iterator();

        // while (ar.hasNext()) {
        // System.out.println(ar.next());
        // }

        // for (int a : arr) {
        // System.out.println(a);
        // }

        // Map<String, Integer> ma = new HashMap<>();
        // Map<String, Integer> ma = new Hashtable<>();

        // ma.put("a1", 12);
        // ma.put("a2", 12);
        // ma.put("a3", 14);

        // System.out.println(ma.keySet());
        // System.out.println(ma.values());

        // for (String a : ma.keySet()) {
        // System.out.println(ma.get(a));
        // }

    }
}
