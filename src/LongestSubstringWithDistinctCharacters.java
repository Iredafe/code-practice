import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithDistinctCharacters {
    public static int lengthOfLongestSubstring(String inputString, int k) {
        int windowStart = 0; int windowEnd= 0; int maxLength = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        while(windowEnd < inputString.length()) {
            char rightChar = inputString.charAt(windowEnd);
            frequencyMap.put(rightChar, frequencyMap.getOrDefault(rightChar,0)+1);

            while(frequencyMap.size() > k){
                char leftChar = inputString.charAt(windowStart);
             frequencyMap.put(leftChar, frequencyMap.getOrDefault(leftChar, 0)- 1);
             if(frequencyMap.get(leftChar) == 0){
                 frequencyMap.remove(leftChar);

             }
                windowStart++;
            }
    maxLength = Math.max(maxLength, windowEnd-windowStart+1);
            windowEnd++;
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "araaci";
        int k = 2;
        System.out.println("Lenth of the longest substring is : " + lengthOfLongestSubstring(s, k));
    }
}
