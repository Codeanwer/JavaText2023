package SecAndSort;

/**
 * @BelongsProject: Leetbooktext
 * @BelongsPackage: SecAndSort
 * @Author: CatherineSS
 * @CreateTime: 2022-11-16  11:03
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j])
                temp[index++] = nums1[i++];
            else
                temp[index++] = nums2[j++];
        }
        for (; i < m; ) {
            temp[index++] = nums1[i++];
        }
        for (; j < n; ) {
            temp[index++] = nums2[j++];
        }
        //再把数组temp中的值赋给nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = temp[k];
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }

}
