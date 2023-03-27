package Arraytext;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: 题目的实现方法
 * @BelongsPackage: text07-text10
 * @Author: CatherineSS
 * @CreateTime: 2022-11-07  19:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {
    public static int[] plusOne(int[] nums) {
        int lengths = nums.length;
        for (int i = lengths - 1; i >= 0; i--) {
            if (nums[i] != 9) {
                //不是9，加1返回即可
                nums[i]++;
                return nums;
            } else {
                //如果是9，则变成0
                nums[i] = 0;
            }
        }
        //如果全是9,则数组长度加1，最开始以1为开始
        int[] temp = new int[lengths + 1];
        temp[0] = 1;
        return temp;
    }

    public static int[] moveZeroes(int[] nums) {
        //非零的数字向前移动
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int index = 0;
        //遍历
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }
        //后面都是0
        while (index < nums.length) {
            nums[index++] = 0;
        }
        return nums;
    }

    public static int[] moveZeroes1(int[] nums) {
        //使用双指针解决
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                //如果是0就不操作
                i++;
            } else if (i != 0) {
                //把当前位置的数放在最前面0的哪个位置，然后当前位置设为0
                nums[j - i] = nums[j];
                nums[j] = 0;
            }
        }
        return nums;
    }

    public static int[] twoSum(int[] nums, int target) {
        //暴力解法
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSim1(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.get(target - nums[i]) != null) {
                return new int[]{m.get(target - nums[i]), i};
            }
            m.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        //先上下交换
        for (int i = 0; i < length / 2; i++) {
            int temp[] = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }
        //然后对角线交换
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


}

