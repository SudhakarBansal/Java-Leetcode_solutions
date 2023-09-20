//268. Missing Number
//         Example 1:
//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//
//        Example 2:
//        Input: nums = [0,1]
//        Output: 2
//
//        Example 3:
//        Input: nums = [9,6,4,2,3,5,7,0,1]
//        Output: 8

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correctIndex = nums[i];
            if (nums[i]< nums.length && nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else {
                i++;
            }
        }
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] arr= {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
}
