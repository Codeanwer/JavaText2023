package Arraytext;

import java.util.Arrays;

/**
 * @BelongsProject: 给定一个 n×n 的二维矩阵matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像
 * @BelongsPackage: Leettext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-08  09:45
 * @Description: TODO
 * @Version: 1.0
 */
public class text10 {
    public static void main(String[] args) {
        int [][] martix={{1,2,3},{4,5,6},{7,8,9}};
        int [][] martix1={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int length=martix.length;
        int length1=martix1.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("%4d",martix[i][j]);
            }
            System.out.println();
        }
        Solution.rotate(martix);
        Solution.rotate(martix1);
        System.out.println();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("%4d",martix[i][j]);
            }
            System.out.println();
        }
        for (int [] data:martix1){
            System.out.println(Arrays.toString(martix1));
        }


    }
}
