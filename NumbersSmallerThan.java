//1365. How Many Numbers Are Smaller Than the Current Number

//Example 1:
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation:
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1).
//For nums[3]=2 there exist one smaller number than it (1).
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

//Example 2:
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]

//Example 3:
//Input: nums = [7,7,7,7]
//Output: [0,0,0,0]

import java.util.Arrays;

public class NumbersSmallerThan {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = nums.clone();
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (nums[i] == arr[j]) {
                    ans[k] = j;
                    k++;
                    break;
                }
            }
        }
        return ans;
    }

}
