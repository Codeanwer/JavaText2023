package Arraytext;

import java.util.Arrays;

/**
 * @BelongsProject: 给定一个整数数组 nums和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * @BelongsPackage: Leettext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-07  20:26
 * @Description: TODO
 * @Version: 1.0
 */
public class text09 {
    public static void main(String[] args) {
            int [] nums={2,7,11,15};
        System.out.println(Arrays.toString(Solution.twoSum(nums,9)));
        System.out.println(Arrays.toString(Solution.twoSim1(nums,9)));
    }
}
