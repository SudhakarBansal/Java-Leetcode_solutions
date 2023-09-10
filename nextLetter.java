//744. Find Smallest Letter Greater Than Target

//Example 1:
//        Input: letters = ["c","f","j"], target = "a"
//        Output: "c"

//        Example 2:
//        Input: letters = ["c","f","j"], target = "c"
//        Output: "f"

//        Example 3:
//        Input: letters = ["x","x","y","y"], target = "z"
//        Output: "x"

class Solution1 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (letters[mid]==target){
                return letters[mid+1];
            } else if (letters[mid] > target) {
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
public class nextLetter {
    public static void main(String[] args) {
        Solution1 obj = new Solution1();
        char[] arr = {'c','f','j'};
        System.out.println(obj.nextGreatestLetter(arr,'d'));
    }
}
