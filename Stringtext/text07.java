package Stringtext;

/**
 * @BelongsProject: 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @BelongsPackage: Stringtext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-15  10:37
 * @Description: TODO
 * @Version: 1.0
 */
public class text07 {
    public static void main(String[] args) {
        String [] strs= {"flower","flow","flight"};
        System.out.println(Solution.longestCommonPrefix(strs));
    }
}
