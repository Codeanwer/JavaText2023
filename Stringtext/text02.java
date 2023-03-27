package Stringtext;

/**
 * @BelongsProject: 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[-2^31,2^ 31− 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-08  10:50
 * @Description: TODO
 * @Version: 1.0
 */
public class text02 {
    public static void main(String[] args) {
        int x=123;
        System.out.println(x);
        System.out.println(Solution.reverse(x));
        x=-123;
        System.out.println(x);
        System.out.println(Solution.reverse(x));
        x=120;
        System.out.println(x);
        System.out.println(Solution.reverse(x));
    }
}
