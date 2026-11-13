import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[5];
        long totalSum = 0;
        nums[0] = 6;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 9;
        int k = 3;
        int mul = 2;
        Arrays.sort(nums);
        Integer[] numsArray = { nums };
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        for (int i = 0; i < n && i < k; i++) {
            if (mul > 0) {
                totalSum += k * nums[i];
                mul--;
            } else
                totalSum += nums[i];
        }
        System.out.println(totalSum);
    }
}