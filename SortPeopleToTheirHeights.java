import java.util.Arrays;

public class SortPeopleToTheirHeights {
    public static String[] sortPeople(String[] names, int[] heights) {
        boolean swapped;
        for (int i = 0; i < heights.length ; i++) {
            swapped=false;
            for (int j = 1; j < heights.length-i; j++) {
                if (heights[j]>heights[j-1]){
                    //swapping names
                    String t = names[j-1];
                    names[j-1]=names[j];
                    names[j]=t;

                    //swapping heights
                    int temp = heights[j-1];
                    heights[j-1] = heights[j];
                    heights[j] = temp;

                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
