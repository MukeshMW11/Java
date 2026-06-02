package starter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CF {
    public static void main(String[] args) {
        // List --> ArrayList,LinkedList

        List<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> linkedList2 = new LinkedList<>();
        list.add(1);
        linkedList.add(12);
        System.out.println(list);
        System.out.println(linkedList);
        // Set --> HashSet,LinkedHashSet

        Set<Integer> set = new HashSet<>();
        set.add(121);
        set.add(11);
        set.add(451);
        set.add(121);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(123);
        set2.add(124);
        System.out.println(set);
        System.out.println(set2);
        // Map --> HashMap, LinkedHashMap

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map);

        System.out.print("Hello World");
    }
}
