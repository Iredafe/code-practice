public class ValidPalindrome {

     static boolean isPalindrome(String s) {

         int i=0; int j=s.length()-1;

         while(i<j) {
             while(i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                 i++;
             }
             while (i<j &&  !Character.isLetterOrDigit(s.charAt(j))) {
                 j--;
             }
             if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                 return false;
             }
             i++;
             j--;
         }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal, Panama!";
        String input2 = "Was it a car or a cat I saw?";
        System.out.println("Palindrome 1 : " + isPalindrome(input1));
        System.out.println("Palindrome 2 : " + isPalindrome(input2));
    }
}
