package Arraytext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class text06 {
    public static void main(String[] args) {
        //给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，
        // 应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    /**
     * @description:
     * @author: CatherineSS
     * @date:  19:24
     * @param: [nums1, nums2]
     * @return:
     **/
    public static int[] intersect(int[] nums1, int[] nums2) {
        //先排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //两个指针指向两个数组的开始
        int i = 0, j = 0;
        //创建一个新的有序集合list
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                //如果num1[i]的值小于nums2[j]，i向后移动一位
                i++;
            } else if (nums1[i] > nums2[j]) {
                //同上
                j++;
            } else {
                //相同的话，就是在并集里，加入list中，并且同时向后移动一位
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        //将list集合转换成一个数组
        int[] nums3 = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            nums3[k] = list.get(k);
        }
        return nums3;
    }
}
