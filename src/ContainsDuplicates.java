import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public boolean containsDuplicateBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;

    }

    public boolean containsDuplicateSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {1, 2, 3, 4, 5, 2, 7, 8, 9};
        System.out.println("Contains duplicate 1: " + new ContainsDuplicates().containsDuplicate(nums1));
        System.out.println("Contains duplicate 2: " + new ContainsDuplicates().containsDuplicate(nums2));

        System.out.println("Contains duplicate brute 1: " + new ContainsDuplicates().containsDuplicateBruteForce(nums1));
        System.out.println("Contains duplicate brute 2: " + new ContainsDuplicates().containsDuplicateBruteForce(nums2));
        System.out.println("Contains duplicate sort 1: " + new ContainsDuplicates().containsDuplicateSort(nums1));
        System.out.println("Contains duplicate sort 2: " + new ContainsDuplicates().containsDuplicateSort(nums2));
    }
}
