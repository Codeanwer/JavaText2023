package Dattext;

/**
 * @BelongsProject: 给你一个数组 nums 。nums 的源数组中，所有元素与 nums 相同，但按非递减顺序排列。
 * 如果nums 能够由源数组轮转若干位置（包括 0 个位置）得到，则返回 true ；否则，返回 false 。
 * 源数组中可能存在 重复项 。
 * 注意：我们称数组 A 在轮转 x 个位置后得到长度相同的数组 B ，当它们满足 A[i] == B[(i+x) % A.length] ，其中 % 为取余运算。
 * @BelongsPackage: Dattext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-27  16:11
 * @Description: TODO
 * @Version: 1.0
 */
public class eletweseven {
    public static void main(String[] args) {
        int[] num1 = {3, 4, 5, 1, 2};//原数组是递增的，轮转后转化成圆形也一定是递增的
        System.out.println(Solution.check(num1));
    }
}

class Solution {
    public static boolean check(int[] nums) {
        int count = 0;//计数器,计算头尾相接时，加一
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;
    }
}
