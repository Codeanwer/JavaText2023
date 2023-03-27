package Arraytext;

//        给你一个整数数组 prices ，其中prices[i] 表示某支股票第 i 天的价格。
//        在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
//        返回 你能获得的 最大 利润。
public class text02 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("最大利润为：" + maxPrices1(prices));
    }

    public static int maxPrices1(int[] price) {
        //判断数组是否正确
        if (price == null || price.length < 2)
            return 0;
        int length = price.length;
        //定义dp[i][0]表示第i天交易完之后手里没有股票的最大利润
        //dp[i][1]表示第i天交易完之后手里持有股票的最大利润。
        int[][] dp = new int[length][2];
        //初始条件
        dp[0][1] = -price[0];
        dp[0][0] = 0;
        for (int i = 1; i < length; i++) {
            //递推公式
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + price[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - price[i]);
        }
        //最后一天不管后面怎么样，肯定将股票卖出最值钱,所以肯定是没有股票的
        return dp[length - 1][0];

    }

    public static int maxPrices2(int[] price) {
        //代码优化：我们看到当天的利润只和前一天有关，没必要使用一个二维数组，只需要使用两个变量，
        // 一个记录当天交易完之后手里持有股票的最大利润，一个记录当天交易完之后手里没有股票的最大利润
        //判断数组是否正确
        if (price == null || price.length < 2)
            return 0;
        int length = price.length;
        //初始条件
        int hold = -price[0];
        int nohold = 0;
        for (int i = 1; i < length; i++) {
            nohold = Math.max(nohold, hold + price[i]);
            hold = Math.max(hold, nohold - price[i]);
        }
        return nohold;
    }

    public static int maxPrices3(int[] price) {
        //贪心算法
        // 比如a<b<c<d，因为从a到d一直是上涨的，那么最大值和最小值的差值就是d-a，
        // 也可以写成(b-a)+(c-b)+(d-c)，所以此题目可以这么写
        int total = 0;
        for (int i = 0; i < price.length - 1; i++) {
            total += Math.max(price[i + 1] - price[i], 0);//将差值大于0的相加即可
        }
        return total;
    }
}
