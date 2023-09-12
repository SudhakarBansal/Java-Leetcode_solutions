
class Solution6 {
    public int findInMountainArray(int target, int[] arr) {
        int searchAsc = Search(target, arr, 0, peakIndexInMountainArray(arr));
        if (searchAsc!=-1){
            return searchAsc;
        }
        return (Search(target,arr,peakIndexInMountainArray(arr)+1,arr.length-1));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int Search(int target, int[] arr, int start, int end) {
        Boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        Solution6 obj = new Solution6();
        System.out.println(obj.findInMountainArray(3, arr));
    }
}
