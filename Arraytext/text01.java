package Arraytext;

public class text01 {
    public static void main(String[] args) {
//        给你一个升序排列的数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
//        由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那num的前 k 个元素应该保存最终结果。
//        将最终结果插入nums 的前 k 个位置后返回 k 。
//        不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
        int[] num = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 8, 8, 9, 9};
        System.out.println("数组的内容如下");
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
      //  Leettext.text01(num);
        System.out.println();
        text02(num);
    }

    private static void text02(int[] num) {
        int conum = Way02(num);
        for (int i = 0; i < conum; i++)
            System.out.print(num[i] + " ");
    }

    private static void text01(int[] num) {
        for (int i = 0; i < Way01(num); i++)
            System.out.print(num[i] + " ");
    }

    public static int Way01(int[] num) {
        //判断数组本身是否有问题
        if (num == null || num.length == 0)
            return 0;
        //使用双指针解决问题
        int left = 0;
        for (int right = 1; right < num.length; right++) {
            //当数组有相同元素时，左指针不动，右指针向后，直到有不一致的元素，将right指针指向的数赋值给1左数组后一位
            if (num[left] != num[right])
                num[++left] = num[right];
        }
        return ++left;
    }

    public static int Way02(int[] A) {
        int count = 0;//重复的数字个数
        for (int right = 1; right < A.length; right++) {
            if (A[right] == A[right - 1]) {
                //如果有重复的，count要加1
                count++;
            } else {
                //如果没有重复，后面的就往前挪
                A[right - count] = A[right];
            }
        }
        //数组的长度减去重复的个数
        return A.length - count;
    }


}
