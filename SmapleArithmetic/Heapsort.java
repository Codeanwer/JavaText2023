package SmapleArithmetic;

import java.util.Arrays;

/**
 * @BelongsProject: 小根堆排序
 * @BelongsPackage: SmapleArithmetic
 * @Author: CatherineSS
 * @CreateTime: 2022-11-24  20:44
 * @Description: TODO
 * @Version: 1.0
 */
public class Heapsort {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 78, 13, 19, 1, 5, 9};
        System.out.println("堆排序前=>" + Arrays.toString(array));
        heapSort(array);
        System.out.println("堆排序后=>" + Arrays.toString(array));
    }

    /**
     * @description: 堆排序
     * @author: CatherineSS
     * @date: 21:07
     * @param: [arrray]
     * @return: void
     **/
    //堆排序
    public static void heapSort(int[] arrray) {
        //从最后一个非叶子节点开始
        for (int i = arrray.length / 2 - 1; i >= 0; i--) {
            //从下至上调整堆结构
            adjustHeap(arrray, i, arrray.length);
        }
        //将堆顶元素与末尾元素交换 将最大元素沉到数组末尾 + 重新调整堆结构
        for (int i = arrray.length - 1; i > 0; i--) {
            //交换堆顶元素以及末尾元素
            swap(arrray, 0, i);
            //交换后的末尾元素忽略(j--) 不再参与堆结构的调整
            //重新调整堆结构
            adjustHeap(arrray, 0, i);
        }
    }

    /**
     * @description: 调整堆结构
     * @author: CatherineSS
     * @date: 21:05
     * @param: [array, index, length]
     * @return: void
     **/
    public static void adjustHeap(int[] array, int index, int length) {
        int temp = array[index];//取出当前元素
        //i节点是index的左子节点
        for (int i = 2 * index + 1; i < length; i = 2 * i + 1) {
            //如果左子节点小于右子节点
            if (i + 1 < length && array[i] < array[i + 1]) {
                i++;//将指针移向较大节点
            }
                //如果子节点大于父节点
            if (array[i] > temp) {
                array[index] = array[i];//将较大值赋值给当前节点
                index = i;//指针移向子节点
            } else {
                break;
            }
        }
        //循环结束时，最大值已经到了栈顶，将temp放在最终值的位置
        array[index] = temp;
    }

    /**
     * @description: 交换
     * @author: CatherineSS
     * @date: 21:11
     * @param: [array, start, end]
     * @return: void
     **/
    public static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
