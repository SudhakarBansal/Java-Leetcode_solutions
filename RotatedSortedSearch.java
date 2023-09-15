class Solution7 {
    public int searchSorted(int[] nums, int target) {
        int pivot = searchPivot(nums, target);
        if (pivot!=-1 && target==nums[pivot]){
            return pivot;
        }
        int searchFirstHalf = SearchItem(target,nums,0,pivot);
        if (searchFirstHalf!=-1){
            return searchFirstHalf;
        }
        return SearchItem(target,nums,pivot+1,nums.length-1);
    }

    public int searchPivot(int nums[], int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (mid > s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] <= nums[s]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int SearchItem(int target, int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

public class RotatedSortedSearch {
    public static void main(String[] args) {
        Solution7 obj = new Solution7();
        int[] arr = {4};
        System.out.println(obj.searchSorted(arr,2));
    }
}
