import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbers {
    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j]!=(j+1)){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] list = {1};
        System.out.println(findDuplicates(list));
    }
}
