package Stringtext;

/**
 * @BelongsProject: 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出
 * needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果needle 不是 haystack 的
 * 一部分，则返回 -1 。

 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-11  20:03
 * @Description: TODO
 * @Version: 1.0
 */
public class text06 {
    public static void main(String[] args) {
        String haystack="sadbutsad",needle="sad";
        System.out.println(Solution.strStr(haystack,needle));
        String haystack1="leetcode";
        String needle1="leeto";
        System.out.println(Solution.strStr(haystack1,needle1));
    }
}
