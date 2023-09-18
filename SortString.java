import java.util.Arrays;

public class SortString {
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String[] sortedArray=new String[arr.length];
        for (String string : arr) {
            int index = Character.getNumericValue(string.charAt((string.length()) - 1));
            sortedArray[index-1] = string.substring(0,string.length()-1);
        }
        return String.join(" ", sortedArray);
    }

    public static void main(String[] args) {
     String s = "is2 sentence4 This1 a3";
     System.out.println(sortSentence(s));
    }
}
