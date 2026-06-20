// class Student {
//     private String name;
//     private int id;

//     public Student() {
//     }

//     public Student(String name, int id) {
//         this.name = name;
//         this.id = id;
//     }

//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", id=" + id + "]";
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         return super.equals(obj);
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

// }

record Student(String name, int id) {

    // public Student() {
    // this("", 0);
    // }

    public Student {
        if (id == 0)
            throw new IllegalArgumentException("Id cannot be zero");
    }

}

public class Rec {
    public static void main(String[] par) {

        Student s1 = new Student("abc", 1);
        Student s2 = new Student("abc", 1);
        System.out.println(s1.name());
        System.out.println(s1.equals(s2));

    }

}
