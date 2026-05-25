package starter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Poly {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(char a, char b) {
        System.out.println("" + a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class Parent {
    public void hello() {
        System.out.println("Hello from parent class");
    }

};

class Child extends Parent {
    @Override
    public void hello() {
        System.out.println("Hello from child class");
    }
}

abstract class PolyAbstract {
    public String tab;

    protected PolyAbstract() {
    }

    abstract void pureAbstract();

    void helloAbstract() {
        System.out.println("Hello from the abstract class");
    }
}

class AbstractExtend extends PolyAbstract {

    @Override
    void pureAbstract() {
        System.out.println("This is the implementation of the abstract method" + tab);
    }

}

// Multiple Inheritance Possivble through interfaces
class TestIntface implements TestInterface, AnotherInterface {
    public void makeCall() {
        System.out.println("This is interface implemetation");
        TestInterface.StatMeth();
    }

    public void makeAnotherCall() {

        System.out.println("This is another interface impelentation");
    }

    public void defaultCall(List<Poly> poly) {
        System.out.println("This is the default system method for interfaces");
    }

}

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.getOrDefault(nums[i], 0) + 1 <= k) {
                numMap.put(nums[i], numMap.getOrDefault(nums[i], 0) + 1);
            } else {
                nums[i] = 0;
            }
        }
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
            }
        }
        return nums;
    }
}