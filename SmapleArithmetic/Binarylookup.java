package SmapleArithmetic;

/**
 * @BelongsProject: 二分查找
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，
 * 如果目标值存在返回下标，否则返回 -1。
 * @BelongsPackage: SmapleArithmetic
 * @Author: CatherineSS
 * @CreateTime: 2022-11-27  16:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Binarylookup {
    public static void main(String[] args) {
        int [] num={-1,0,3,5,9,12};
        int [] num2={-1,0,3,5,9,12};
        System.out.println(search(num,9));
        System.out.println(search(num2,2));
    }
    public static int search(int [] nums,int target){
        int left=0,right=nums.length-1;//定义区间
        while(left<=right){
            int middle=(left+right)/2;//取中间
            if (nums[middle]>target){
                right=middle-1;
            } else if (nums[middle]<target) {
                left=middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
