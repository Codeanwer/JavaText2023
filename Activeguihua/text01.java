package Activeguihua;

/**
 * @BelongsProject: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @BelongsPackage: Activeguihua
 * @Author: CatherineSS
 * @CreateTime: 2022-11-17  10:58
 * @Description: TODO
 * @Version: 1.0
 */
public class text01 {
    public static void main(String[] args) {
        System.out.println(Solution.climbStairs(3));
        System.out.println(Solution.climbStairs1(3));
        System.out.println(Solution.climbStairs2(3));
    }
}
