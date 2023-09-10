//    Given a string s consisting of words and spaces, return the length of the last word in the string.
//    Example 1:
//    Input: s = "Hello World"
//    Output: 5

//    Example 2:
//    Input: s = "   fly me   to   the moon  "
//    Output: 4

//    Example 3:
//    Input: s = "fluffy is still joyboy"
//    Output: 6

class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == ' ') {
                return (s.length()-i-1);
            }
        }
        return s.length();
    }
};

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution obj= new Solution();
        System.out.println(obj.lengthOfLastWord("fluffy is still joyboy"));
    }
}


