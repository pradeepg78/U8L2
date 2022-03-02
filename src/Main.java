import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{2, 4, 3},
                    {1, 8, 6},
                    {7, 4, 9}};

        System.out.println(hasDuplicates(nums));

        int[][] nums2 = {{2, 4, 3},
                {1, 4, 6},
                {7, 8, 9}};

        System.out.println(hasDuplicates(nums2));

        int[][] nums3 = {{2, 4, 3},
                {1, 3, 6},
                {7, 8, 9}};

        System.out.println(hasDuplicates(nums3));
    }

    public static boolean hasDuplicates(int[][] checkList)
    {
        for (int i = 0; i < checkList[0].length; i++) {
            for (int x = 0; x < checkList.length ; x++) {
                int c = checkList[x][i];
                for (int y = x + 1; y < checkList.length; y++)
                {
                    if (c == checkList[y][i]) return true;
                }
            }
        }
        return false;
    }
}
