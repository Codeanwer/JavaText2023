package Stringtext;

/**
 * @BelongsProject: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意;若s和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-10  11:14
 * @Description: TODO
 * @Version: 1.0
 */
public class text04 {
    public static void main(String[] args) {
        String s="anagram",t="nagaram";
        System.out.println(Solution.isAnagram(s,t));
        System.out.println(Solution.isAnagram1(s,t));
        System.out.println();
        s = "rat";
        t = "car";
        System.out.println(Solution.isAnagram(s,t));
        System.out.println(Solution.isAnagram1(s,t));
    }
}
