
import java.util.*;

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
                result.add(new int[]{i, j});
                i++;
                j--;
            }

        }
            return result;


    }

    private static List<int []> pairWithTargetSumHashMap(int [] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            Integer complement = target - arr[i];
            if(map.containsKey(complement)) {
                result.add(new int[]{map.get(complement), i});
            }else{
                map.put(arr[i], i);
            }
        }

        return result;
    }

    public static int[] search(int[] arr, int targetSum) {
        HashMap<Integer, Integer> nums = new HashMap<>(); // to store numbers and indices
        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];
            if (nums.containsKey(complement))
                return new int[] { nums.get(complement), i };
            else
                nums.put(arr[i], i); // put the number and its index in the map
        }
        return new int[] { -1, -1 }; // pair not found
    }
    public static void main(String[] args) {
        int [] arr= new int [] {1, 2, 3, 4, 6};
        int target = 6;
        List<int[]> result = pairWithTargetSum(arr, target);
        System.out.println("Pairs with sum " + target + ":");
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
        List<int[]> result1 = pairWithTargetSumHashMap(arr, target);
        System.out.println("Pairs with sum hashmap: " + target + ":");
        for (int[] pair : result1) {
            System.out.println(Arrays.toString(pair));
        }
        int[] result2 = search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result2[0] + ", " + result2[1] + "]");
        result2 = search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result2[0] + ", " + result2[1] + "]");

    }
}
