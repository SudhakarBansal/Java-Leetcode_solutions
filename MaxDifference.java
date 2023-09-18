import java.util.Arrays;

public class MaxDifference {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDif = 0;
        if(nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length-1; i++) {
            int dif = nums[i+1] - nums[i];
            if (dif > maxDif) {
                maxDif = dif;
            }
        }
        return maxDif;
    }

    public static void main(String[] args) {
        int[] nums = {3,9,6, 1};
        System.out.println(maximumGap(nums));
    }
}
