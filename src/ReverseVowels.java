public class ReverseVowels {

    public static String reverseVowels(String input) {
        String vowels = "aeiouAEIOU";

        char[] charArray = input.toCharArray();
        int i=0;
        int j= charArray.length-1;
            while(i<j) {
                while(i<j && vowels.indexOf(charArray[i])==-1){
                    i++;
                }
                while(i<j && vowels.indexOf(charArray[j])==-1){
                    j--;
                }
                swap(charArray, i, j);
                i++;
                j--;
            }

        return new String(charArray);
    }


    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "AEIOU";
        String input3 = "DesignGUrus";
        System.out.println("Reverse Vowels 1 holle :  " + reverseVowels(input1));
        System.out.println("Reverse Vowels 2 UOIEA : " + reverseVowels(input2));
        System.out.println("Reverse Vowels 3 DusUgnGires : " + reverseVowels(input3));
    }
}
