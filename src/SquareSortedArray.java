import java.util.Arrays;
import java.util.List;

public class SquareSortedArray {

    private static int[] squareSortedArray(int [] array) {
        int [] result = new int[array.length];
        int left=0, right= array.length-1, highest= array.length-1;

        while(left<=right) {
            int squareLeft = array[left] * array[left];
            int squareRight = array[right] * array[right];

            if(squareRight >= squareLeft) {
                result[highest--]=squareRight;
                right--;
            }else{
                result[highest--]=squareLeft;
                left++;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int [] arr = {-2, -1, 0, 2, 3};
        int[] result = squareSortedArray(arr);

        for(int num: result) {
            System.out.println("Square Array : " + num);
        }
    }
}
