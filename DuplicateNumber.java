//287. Find the Duplicate Number
//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//        There is only one repeated number in nums, return this repeated number.
//        You must solve the problem without modifying the array nums and uses only constant extra space.

//        Example 1:
//        Input: nums = [1,3,4,2,2]
//        Output: 2

//        Example 2:
//        Input: nums = [3,1,3,4,2]
//        Output: 3


import java.util.Arrays;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correctIndex = nums[i]-1;
            if (nums[i]!=nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
    }
}
