//34. Find First and Last Position of Element in Sorted Array
//
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
//
//        Example 1:
//
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//        Example 2:
//
//        Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
//        Example 3:
//
//        Input: nums = [], target = 0
//        Output: [-1,-1]

import java.util.Arrays;
class Solution4 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchIndex(nums,target,true);
        if (ans[0]!=-1){
            ans[1] = searchIndex(nums,target,false);
        }
        return ans;
    }

    public int searchIndex(int[] arr, int target, boolean FirstIndex){
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==target){
                ans = mid;
                if (FirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }
}

public class FirstLastElement {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        Solution4 s1 = new Solution4();
        System.out.println(Arrays.toString(s1.searchRange(arr, 7)));
    }
}
