package SecAndSort;

import java.util.Arrays;

/**
 * @BelongsProject: 给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，
 * 分别表示 nums1 和 nums2 中的元素数目。请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * @BelongsPackage: SecAndSort
 * @Author: CatherineSS
 * @CreateTime: 2022-11-16  11:03
 * @Description: TODO
 * @Version: 1.0
 */
public class text01 {
    public static void main(String[] args) {
        int [] num1={1,2,3,0,0,0};
        int [] num2={2,5,6};
        int m=3,n=3;
        Solution.merge1(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));

    }
}
