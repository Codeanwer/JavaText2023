package Stringtext;

import java.util.Arrays;

/**
 * @BelongsProject: 题目的实现方法
 * @BelongsPackage: text01-
 * @Author: CatherineSS
 * @CreateTime: 2022-11-08  10:41
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {
    public static void reverseString(char[] s) {
        int length = s.length;
        char temp;
        for (int i = 0; i < length / 2; i++) {
            temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (int) res == res ? (int) res : 0;
    }

    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        //统计某个字符出现的次数
        for (int i = 0; i < s.length(); i++) {
            count[chars[i] - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
        return -1;
    }

    public static boolean isAnagram(String s, String t) {
        //先统计字符串s中每个字符的数量
        //减去t中每个字符对应的数量

        //长度不同直接给false
        if (s.length() != t.length())
            return false;
        int[] letterCount = new int[26];
        //统计s中每个字符的数量
        for (int i = 0; i < s.length(); i++)
            letterCount[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            letterCount[t.charAt(i) - 'a']--;
        //如果数组的每个值都是0，则为TRUE否则为false
        for (int count : letterCount) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public static boolean isAnagram1(String s, String t) {
        //先排序，在比较
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        //排序
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }

    public static boolean isPalindrome(String s) {
        //双指针解决
        if (s.length() == 0)
            return true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //只考虑数字与字母，先过滤字母与数字
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            //将两个字符变成小写，判断是否一样
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        //排除出字符以及数字以外的元素
        String ac = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(ac).reverse().toString();
        return ac.equals(rev);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int i = 0;
        int j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                //如果不匹配，就回退，从第一次匹配的下一个开始，
                i = i - j + 1;
                j = 0;
            }
            if (j == needle.length())
                return i - j;
        }
        return -1;
    }


    public static String longestCommonPrefix(String[] strs){
        //判断字符是否合法
        if(strs==null||strs.length==0)
            return "";
            //默认第一个字符是他们的公共词缀
            String pre=strs[0];
            int i=1;
            while (i<strs.length){
                //不断的截取
                while (strs[i].indexOf(pre)!=0)
                    pre=pre.substring(0,pre.length()-1);
                    i++;
            }
      return pre;
    }

}
