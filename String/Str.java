package String;

import com.sun.source.doctree.SeeTree;

public class Str {

    public static void main(String[] args) {
//        String s1 = "ja" + "va";
//        String s2 = "java"; // String pool as this is compile time constant
//        String s3 = "ja" ; // String pool as this is also compile time constant
//        String s4  = s3 + "va"; // But s3 here is dynamically defined so it goes to heap memory as well as "va" is stored in string pool without any                        reference and may be eliminated later on by GC.
//            String s5 = "Java";
//            String s6 = s5;
//            System.out.println(s5 == s6);
//        System.out.println(s2.equals(s4));


//        System.out.println( s1 == s2);

//        String s1 = new String(" ");
//        System.out.println(s1.isBlank());
//        System.out.println(s1.isEmpty());
//        int[] a = {99,103,104,123,113,110,111};
//        char[] a = {'a', 'b', 'c'};
//        byte[]  a ={121,123,127};
//        String s1 = new String(a,0,3);
//        System.out.println(s1);

//        StringBuilder stringBuilder =  new StringBuilder("Hello World");
//        System.out.println(stringBuilder);
//        StringBuffer stringBuffer = new StringBuffer("Hello World again");
//        System.out.println(stringBuffer);

//        StringBuilder stringBuilder = new StringBuilder(50);
//            StringBuilder s1 = new StringBuilder("Hello");
//            s1.reverse();

//        System.out.println(s1.capacity());
//        String s1 = new String("abg");
//        String s2 = s1;
//        String s2 = new String("abc");
//                System.out.println(s1.contains("Hello"));
//        System.out.println(s1.indexOf("World"));
//        System.out.println(s1.startsWith("Hel"));
//        System.out.println(s1.endsWith("ld"));
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.toCharArray());
//        char[] a = s1.toCharArray();
//
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.compareTo(s2));

//        System.out.println(s1.substring(2));
//        System.out.println(s1.toUpperCase());
//       s1 = s1.replace("a","y");
//        s1 =s1.replaceAll("yb", "World");
//        System.out.println(s1);
//        System.out.println();
//        String[] s = s1.split(" ");
//        String k = String.join("-" ,"Apple", " Mac", "Ipad");
//        System.out.println(k);

//        String s3 = new String(String.valueOf(10));
//        System.out.println(s3);
//
//       byte[] bt =  s1.getBytes();
//
//        String s3 = s1.intern();
//        System.out.println(s1 == s3);
//        System.out.println(String.format("The string is %s", s1));


        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append("Hello");
//        System.out.println(stringBuilder);
        System.out.println(stringBuilder.insert(2,10));
        System.out.println(stringBuilder.insert(4,"l"));
        System.out.println(stringBuilder.delete(1,2));
        System.out.println(stringBuilder.reverse());
//        stringBuilder.ensureCapacity(50);
        System.out.println(stringBuilder.capacity());
        stringBuilder.trimToSize();
        System.out.println(stringBuilder.capacity());


    }
}
