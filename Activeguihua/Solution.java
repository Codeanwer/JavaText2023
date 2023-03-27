package Activeguihua;

/**
 * @BelongsProject: Leetbooktext
 * @BelongsPackage: Activeguihua
 * @Author: CatherineSS
 * @CreateTime: 2022-11-17  11:02
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {
    public static int climbStairs(int n){
        //递归实现
        if (n<=1)
            return 1;
        if (n<3)
            return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static int climbStairs1(int n){
        //动态规划
        if (n<=1)
            return 1;
        int [] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int climbStairs2(int n) {
        //非递归优化
        if (n<=2)
            return n;
        int first=1,second=2,sum=0;
        while (n-- >2){
            sum=first+second;
            first=second;
            second=sum;
        }
        return  sum;
    }





}
