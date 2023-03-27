package Arraytext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class text05 {
    public static void main(String[] args) {
//        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
//        找出那个只出现了一次的元素。
        int[] arry1 = {2, 2, 1};
        int[] arry2 = {4, 1, 2, 1, 2};
        System.out.println(Arrays.toString(arry1) + "数组中不重复的元素为" + singleNumber(arry1));
        System.out.println(Arrays.toString(arry2) + "数组中不重复的元素为" + singleNumber(arry2));
        System.out.println();
        System.out.println(Arrays.toString(arry1) + "数组中不重复的元素为" + singNumber(arry1));
        System.out.println(Arrays.toString(arry2) + "数组中不重复的元素为" + singNumber(arry2));
    }

    public static int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce = reduce ^ num;
        }
        return reduce;
    }

    public static int singNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                //如果添加失败，说明这个值重复了，删除这个值
                set.remove(num);
            }
        }
        //最终set只有一个元素，返回即可
        return (int) set.toArray()[0];
    }
}
