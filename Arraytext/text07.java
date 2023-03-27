package Arraytext;
import java.util.Arrays;

/**
 * @BelongsProject: Leetbooktext07
 * @BelongsPackage: PACKAGE_NAME
 * @Author: CatherineSS
 * @CreateTime: 2022-11-07  19:25
 * @Description: TODO
 * @Version: 1.0
 */
public class text07 {
    public static void main(String[] args) {
        //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
        //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
        //你可以假设除了整数 0 之外，这个整数不会以零开头。
        int [] digits1={4,3,2,9};
        int [] digits2={9,9,9,9};
        System.out.println(Arrays.toString(Solution.plusOne(digits1)));
        System.out.println(Arrays.toString(Solution.plusOne(digits2)));
    }

}
