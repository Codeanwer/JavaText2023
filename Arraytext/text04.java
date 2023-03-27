package Arraytext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class text04 {
    public static void main(String[] args) {
        //[1,1,1,3,3,4,3,2,4,2]    [1,2,3,4]
        //给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
        // 如果数组中每个元素互不相同，返回 false
        int[] arry1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] arry2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate1(arry1));
        System.out.println(containsDuplicate1(arry2));
        System.out.println();
        System.out.println(containsDuplicate2(arry1));
        System.out.println(containsDuplicate2(arry2));
        System.out.println();
        System.out.println(containsDuplicate3(arry1));
        System.out.println(containsDuplicate3(arry2));

    }

    public static boolean containsDuplicate3(int[] nums) {
        // set集合中的元素是不能有重复的，在添加的时候如果有重复的，会把之前的值给覆盖，
        // 并且返回false。
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        //暴力求解
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        //可以先排序，然后只要找连续的两个有一次相同即可
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }


}
