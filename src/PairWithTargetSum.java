
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairWithTargetSum {

    private static List<int []> pairWithTargetSum(int [] arr, int target) {

        int i = 0;
        int j = arr.length - 1;
        List<int[]> result = new ArrayList<>();

        while (i < j) {

            int sum = arr[i] + arr[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                result.add(new int[]{arr[i], arr[j]});
                i++;
                j--;
            }

        }
            return result;


    }


    public static void main(String[] args) {
        int [] arr= new int [] {1, 2, 3, 4, 6};
        int target = 6;
        List<int[]> result = pairWithTargetSum(arr, target);
        System.out.println("Pairs with sum " + target + ":");
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }

    }
}
