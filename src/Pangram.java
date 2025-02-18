import java.util.HashSet;
import java.util.Set;

public class Pangram {

    boolean isPangram(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(currentChar)) {
                set.add(currentChar);
            }
        }
        return set.size() == 26;
    }
    public static void main(String[] args) {
        String input1= "TheQuickBrownFoxJumpsOverTheLazyDog";
        String input2= "This is not a pangram";

        System.out.println("Pangram 1? " + new Pangram().isPangram(input1));
        System.out.println("Pangram 2? " + new Pangram().isPangram(input2));
    }
}
