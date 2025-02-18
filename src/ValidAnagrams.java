import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
            frequencyMap.put(t.charAt(i), frequencyMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Character frequency : frequencyMap.keySet()) {
            if (frequencyMap.get(frequency) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is anagram 1: " + isAnagram("anagram", "nagaram"));
        System.out.println("Is anagram 2: " +isAnagram("listen", "silent"));
    }

}
