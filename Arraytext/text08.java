package Arraytext;

import java.util.Arrays;

/**
 * @BelongsProject: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 * 同时保持非零元素的相对顺序。请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * @BelongsPackage: Leettext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-07  19:58
 * @Description: TODO
 * @Version: 1.0
 */
public class text08 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 20, 79, 0, 7};
        System.out.println(Arrays.toString(Solution.moveZeroes(nums)));
        System.out.println(Arrays.toString(Solution.moveZeroes1(nums)));
    }
}
