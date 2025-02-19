import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleSumToZero {

    private static List<List<Integer>> getTriplets(int [] array){
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(array);

        for(int i = 0; i < array.length-2; i++){
            if(i>0 && array[i] == array[i-1]) {
                continue;
            }
            findPairs(i+1, array, -array[i], triplets);
        }

        return triplets;
    }

    private static void findPairs(int left, int[] array, int targetSum, List<List<Integer>> triplet){
        int right = array.length - 1;
        int currentSum;
        while (left<right){
            currentSum = array[left] + array[right];
            if(currentSum ==targetSum) {
                triplet.add(Arrays.asList(array[left], array[right], -targetSum));
                left++;
                right--;

                while (left < right && array[left] == array[left - 1]) {
                    left++;
                }
                while (left < right && array[right] == array[right + 1]) {
                    right--;
                }
            }
            else if(currentSum > targetSum){
                right--;
            }else {
                left++;
            }

            }

    }


    public static void main(String[] args) {

        int [] arr = {-3, 0, 1, 2, -1, 1, -2};
        System.out.println("Triplets: " + getTriplets(arr));
    }
}
