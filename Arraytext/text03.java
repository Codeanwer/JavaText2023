package Arraytext;

import java.util.Arrays;

//给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数
public class text03 {
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println("原数组内容如下" + Arrays.toString(arry));
        // rorate(arry, 3);
        // System.out.println("轮转后数组内容如下" + Arrays.toString(arry));

//        System.out.println("原数组内容如下" + Arrays.toString(arry));
//        rorate2(arry,3);
//        System.out.println("轮转后数组内容如下" + Arrays.toString(arry));

        System.out.println("原数组内容如下" + Arrays.toString(arry));
        rorate3(arry, 3);
        System.out.println("轮转后数组内容如下" + Arrays.toString(arry));
    }

    public static void rorate3(int[] arry, int k) {
        int hold = arry[0];
        int index = 0;
        int length = arry.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            index = (index + k) % length;
            if (visited[index]) {
                //判断是否访问过
                index = (index + 1) % length;
                hold = arry[index];
                i--;
            } else {
                //保存当前值到下一个位置，保存前把下一个位置的值记录下来
                visited[index] = true;
                int temp = arry[index];
                arry[index] = hold;
                hold = temp;
            }
        }
    }

    public static void rorate2(int[] arry, int k) {
        //先反转全部数组，在反转前k个，最后在反转剩余的
        int length = arry.length;
        k %= length;
        reverse(arry, 0, length - 1);//反转全部数组
        reverse(arry, 0, k - 1);//反转前k个
        reverse(arry, k, length - 1);//反转剩余
    }

    public static void reverse(int[] arry, int start, int end) {
        //将数组从start到end之间翻转
        while (start < end) {
            int temp = arry[start];
            arry[start++] = arry[end];
            arry[end--] = temp;
        }
    }

    public static void rorate(int[] num, int key) {
        //创建一个新数组，存入原数组数据后，在轮转存入原数组
        int length = num.length;
        int[] temp = new int[length];
        //将原数组元素复制到一个新数组
        for (int i = 0; i < length; i++)
            temp[i] = num[i];
        //将原数组的值转换后存入原数组
        for (int i = 0; i < length; i++)
            num[(i + key) % length] = temp[i];
    }
}
