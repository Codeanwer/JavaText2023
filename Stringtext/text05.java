package Stringtext;

/**
 * @BelongsProject: 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符
 * 之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * 字母和数字都属于字母数字字符。
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-11  19:30
 * @Description: TODO
 * @Version: 1.0
 */
public class text05 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(Solution.isPalindrome(s));
        System.out.println(Solution.isPalindrome1(s));
        s="race a car";
        System.out.println(Solution.isPalindrome(s));
        System.out.println(Solution.isPalindrome1(s));

    }
}
