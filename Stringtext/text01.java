package Stringtext;

import java.util.Arrays;

/**
 * @BelongsProject: 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-08  10:34
 * @Description: TODO
 * @Version: 1.0
 */
public class text01 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println(Arrays.toString(s));
        Solution.reverseString(s);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s1));
        Solution.reverseString(s1);
        System.out.println(Arrays.toString(s1));
    }
}
