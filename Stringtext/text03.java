package Stringtext;

/**
 * @BelongsProject: 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。
 * 如果不存在，则返回 -1
 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-09  11:46
 * @Description: TODO
 * @Version: 1.0
 */
public class text03 {
    public static void main(String[] args) {
        String s= "leetcode";
        System.out.println(Solution.firstUniqChar(s));
        s= "loveleetcode";
        System.out.println(Solution.firstUniqChar(s));
        s= "aabb";
        System.out.println(Solution.firstUniqChar(s));

    }
}
