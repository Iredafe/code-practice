public class FindNonDuplicateNumberInstances {

    private static int findNonDuplicateNumbers(int[] arr) {

        int nextNonDuplicate=1;

        for(int i=1;i<arr.length;i++) {
            if(arr[nextNonDuplicate-1]!=arr[i]) {
                arr[nextNonDuplicate]=arr[i];
                nextNonDuplicate++;
            }

        }

        return nextNonDuplicate;
    }

    private static int removeInstancesOfKey(int[] arr, int key) {
        int instanceOfKey=0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] != key) {
            arr[instanceOfKey]=arr[i];
            instanceOfKey++;
            }
        }
        return instanceOfKey;
    }

    public static void main(String[] args) {
        int [] array = {3, 2, 3, 6, 3, 10, 9, 3};
        int key = 3;
        System.out.println("removeInstancesOfKey : " + removeInstancesOfKey(array, key));
        int [] arr  = {2, 3, 3, 3, 6, 9, 9};
        System.out.println("non duplicate numbers: " + findNonDuplicateNumbers(arr));
    }
}
