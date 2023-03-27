package Dattext;

/**
 * @BelongsProject: 给你一个整数数组 nums 和两个整数：left 及 right 。
 * 找出 nums 中连续、非空且其中最大元素在范围[left, right] 内的子数组，并返回满足条件的子数组的个数
 * @BelongsPackage: Dattext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-24  23:43
 * @Description: TODO
 * @Version: 1.0
 */
public class eletwefour {
    public static void main(String[] args) {
        int[] array = {2, 9, 2, 5, 6};
        System.out.println(numSubarrayBoundedMax1(array, 2, 8));
        System.out.println(numSubarrayBoundedMax2(array,2,8));
    }

    public static int numSubarrayBoundedMax1(int[] nums, int left, int right) {
        // 最大元素满足大于等于Left小于等于Right的子数组个数 = 最大元素小于等于Right的子数组个数 - 最大元素小于Left的子数组个数
        return numSubarrayBoundedMax1(nums, right) - numSubarrayBoundedMax1(nums, left - 1);
    }

    /**
     * @description: 求子数组个数
     * @author: CatherineSS
     * @date: 0:11
     * @param: [nums, right]
     * @return: 子数组个数
     **/
    private static int numSubarrayBoundedMax1(int[] nums, int right) {
        int res = 0;
        int numSubarray = 0;
        for (int num : nums) {
            if (num <= right) {
                numSubarray++;
                res += numSubarray;
            } else {
                numSubarray = 0;
            }
        }
        return res;
    }

    public static int numSubarrayBoundedMax2(int[] nums, int left, int right) {
        int j = -1, temp = 0, ans = 0;
        // 对数组的每一个元素进行检查、如果大于right，令j=i，那么temp = i - j=0；
        // 如果大于left但小于right,  i因为++但是j仍未变，导致temp= i - j = 1，计数器+temp;
        // 如果小于left，那么不进行任何操作,temp不变仍为1，计数器+temp；
        //该思路的核心仍是：因为题目要求“连续”，所以子数组中满足要求的条件是至少有一个数在left和right之间，
        // 可以允许小于left但绝不允许大于right，因此只要在检查数组时，前方的元素a满足条件，
        // 那么后方的元素b仍满足条件则判断temp+1，小于left则跟随前面的temp不变，大于right，temp清零。
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right)
                j = i;
            if (nums[i] >= left)
                temp = i - j;
            ans += temp;
        }
        return ans;
    }


}
